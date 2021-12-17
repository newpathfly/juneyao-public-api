package com.juneyao.api.model.common;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FlightInfoComb {

    @JsonProperty("FlightRouteComb")
    @NotBlank
    String flightRouteComb;

    @JsonProperty("FlightNoComb")
    String flightNoComb;

    @JsonProperty("FlightInfoList")
    @NotEmpty
    @Valid
    List<FlightInfo> flightInfoList;

    @JsonProperty("CabinFareCombList")
    @Valid
    List<CabinFare> cabinFareCombList;

    @JsonProperty("FareType")
    @NotBlank
    String fareType;

    @JsonProperty("TotalFlightTime")
    String totalFlightTime;

    @JsonProperty("StopTime")
    String stopTime;
}
