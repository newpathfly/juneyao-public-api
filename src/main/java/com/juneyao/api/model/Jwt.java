package com.juneyao.api.model;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Jwt {

    private Jwt() {
    }

    @Setter
    @Getter
    @NoArgsConstructor
    public static class Header {

        @NotBlank
        String typ;

        @NotBlank
        String alg;
    }

    @Setter
    @Getter
    @NoArgsConstructor
    public static class Payload{

        @NotEmpty
        List<String> aud;

        @NotEmpty
        List<String> scope;

        @NotNull
        @Positive
        Long exp;

        @NotEmpty
        List<String> authorities;

        @NotBlank
        String jti;

        @JsonProperty("client_id")
        @NotBlank
        String clientId;
    }
}
