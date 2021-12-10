package com.juneyao.api.model.shop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Iterator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.juneyao.api.model.common.Segment;
import com.juneyao.api.model.common.enums.FlightDirection;
import com.juneyao.api.model.common.enums.RouteType;
import com.juneyao.api.model.shop.SearchOne.FlightFareRequest;
import com.juneyao.api.utils.ModelValidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import lombok.SneakyThrows;

class SearchOneTest {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private final static ModelValidator BASIC_REQUEST_VALIDATOR = new ModelValidator();

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter
            .ofPattern("uuuu-MM-dd")
            .withResolverStyle(ResolverStyle.STRICT);

    private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter
            .ofPattern("uuuu-MM-dd HH:mm")
            .withResolverStyle(ResolverStyle.STRICT);

    @Test
    @SneakyThrows
    void positiveTest_FlightFareRequest() {
        FlightFareRequest expectedRequest = buildFlightFareRequest();

        BASIC_REQUEST_VALIDATOR.validate(expectedRequest);

        String json = OBJECT_MAPPER.writeValueAsString(expectedRequest);

        FlightFareRequest actualRequest = OBJECT_MAPPER.readValue(json, FlightFareRequest.class);

        assertEquals(expectedRequest, actualRequest);
    }

    private static FlightFareRequest buildFlightFareRequest() {
        Segment segment = buildSegment();

        return FlightFareRequest.builder()
                .channelCode("TEST")
                .routeType(RouteType.RT)
                .fareSource("Searchone")
                .segment(segment)
                .build();
    }

    private static Segment buildSegment() {
        return Segment.builder()
                .segNO(0)
                .flightDirection(FlightDirection.G)
                .depCity("SHA")
                .arrCity("HEL")
                .flightDate(LocalDate.now().plusMonths(1).format(DATE_FORMATTER))
                .build();
    }

    private static void assertEquals(FlightFareRequest a, FlightFareRequest b) {
        Assertions.assertEquals(a.getChannelCode(), b.getChannelCode());
        Assertions.assertEquals(a.getRouteType(), b.getRouteType());
        Assertions.assertEquals(a.getFareSource(), b.getFareSource());

        Assertions.assertEquals(a.getSegCondList().size(), b.getSegCondList().size());

        Iterator<Segment> iteratorA = a.getSegCondList().iterator();
        Iterator<Segment> iteratorB = b.getSegCondList().iterator();

        while (iteratorA.hasNext() && iteratorA.hasNext()) {
            Segment segmentA = iteratorA.next();
            Segment segmentB = iteratorB.next();
            assertEquals(segmentA, segmentB);
        }
    }

    private static void assertEquals(Segment a, Segment b) {
        Assertions.assertEquals(a.getSegNO(), b.getSegNO());
        Assertions.assertEquals(a.getFlightDirection(), b.getFlightDirection());
        
        Assertions.assertEquals(a.getDepCity(), b.getDepCity());
        Assertions.assertEquals(a.getArrCity(), b.getArrCity());
        
        Assertions.assertEquals(a.getDepAirport(), b.getDepAirport());
        Assertions.assertEquals(a.getArrAirport(), b.getArrAirport());

        Assertions.assertEquals(a.getFlightDate(), b.getFlightDate());
    }
}
