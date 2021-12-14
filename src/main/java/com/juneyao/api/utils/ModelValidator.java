package com.juneyao.api.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import com.juneyao.api.model.Jwt;
import com.juneyao.api.model.common.Segment;
import com.juneyao.api.model.shop.SearchOne;

public class ModelValidator {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter
            .ofPattern("uuuu-MM-dd")
            .withResolverStyle(ResolverStyle.STRICT);

    private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter
            .ofPattern("uuuu-MM-dd HH:mm")
            .withResolverStyle(ResolverStyle.STRICT);

    private final Validator _validator;

    public ModelValidator() {
        _validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    public void validate(Jwt.Payload payload) {
        validateInternal(payload);
    }

    public void validate(SearchOne.FlightFareRequest request) {
        validateInternal(request);

        request.getSegCondList().forEach(this::validate);
    }

    public void validate(SearchOne.FlightFareResponse response) {
        validateInternal(response);
    }

    public void validate(Segment segment) {
        validateInternal(segment);

        validateDate(segment.getFlightDate());
    }

    public static void validateDate(String date) {
        if (null == date) {
            throw new IllegalArgumentException("date should not be null.");
        }

        LocalDate localDate;
        try {
            localDate = LocalDate.parse(date, DATE_FORMATTER);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(String.format("date string is not in YYYY-MM-DD format: `%s`", date), e);
        }

        if (localDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException(String.format("date `%s` should not be earlier than today `%s`", date,
                    LocalDate.now().format(DATE_FORMATTER)));
        }
    }

    public static void validateDateTime(String dateTime) {
        if (null == dateTime) {
            throw new IllegalArgumentException("dateTime should not be null.");
        }

        try {
            LocalDateTime.parse(dateTime, DATETIME_FORMATTER);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(
                    String.format("dateTime string is not in YYYY-MM-DD HH:mm format: `%s`", dateTime), e);
        }
    }

    private <T> void validateInternal(T request) {
        Set<ConstraintViolation<T>> violations = _validator.validate(request);
        for (ConstraintViolation<T> violation : violations) {
            if (null != violation)
                throw new IllegalArgumentException(String.format("%s: %s::%s", violation.getMessage(),
                        violation.getLeafBean().getClass().getSimpleName(), violation.getPropertyPath().toString()));
        }
    }
}
