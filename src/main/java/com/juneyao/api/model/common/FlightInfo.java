package com.juneyao.api.model.common;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.juneyao.api.model.common.enums.FlightDirection;

public class FlightInfo {
    
    private FlightInfo() {}

    @JsonProperty("ID")
    @NotBlank
    String id;

    @JsonProperty("FlightDirection")
    @NotNull
    FlightDirection flightDirection;

    @JsonProperty("DepCity")
    @NotBlank
    @Size(max = 3)
    String depCity;

    @JsonProperty("ArrCity")
    @NotBlank
    @Size(max = 3)
    String arrCity;

    // @todo
}
