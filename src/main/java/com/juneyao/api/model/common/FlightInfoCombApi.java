package com.juneyao.api.model.common;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightInfoCombApi {

    private FlightInfoCombApi() {
    }

    @JsonProperty("FlightRouteComb")
    @NotBlank
    String flightRouteComb;

    // @todo
}
