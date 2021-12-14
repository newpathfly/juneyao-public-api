package com.juneyao.api.model;

import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.juneyao.api.utils.ModelValidator;

import org.junit.jupiter.api.Test;

import lombok.SneakyThrows;

class JwtTest {
    
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private final static ModelValidator BASIC_REQUEST_VALIDATOR = new ModelValidator();

    @Test
    @SneakyThrows
    void positiveTest_JwtPayload() {
        InputStream inputStream = getClass().getResourceAsStream("/SampleJsonWebTokenPayload.json");

        Jwt.Payload payload = OBJECT_MAPPER.readValue(inputStream, Jwt.Payload.class);
        BASIC_REQUEST_VALIDATOR.validate(payload);
    }
}
