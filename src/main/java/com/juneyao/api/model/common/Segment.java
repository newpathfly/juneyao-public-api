package com.juneyao.api.model.common;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.juneyao.api.model.common.enums.FlightDirection;

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
public class Segment {
    
    @JsonProperty("SegNO")
    @NotNull
    @PositiveOrZero
    Integer segNO;

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

    @JsonProperty("DepAirport")
    @Size(max = 3)
    String depAirport;

    @JsonProperty("ArrAirport")
    @Size(max = 3)
    String arrAirport;

    @JsonProperty("FlightDate")
    @NotBlank
    @Size(max = 10)
    String flightDate;
}
