package com.juneyao.api.model.common;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.juneyao.api.model.common.enums.FlightDirection;

import lombok.Singular;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightInfo {
    
    private FlightInfo() {}

    @JsonProperty("ID")
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

    @JsonProperty("FlightDate")
    @NotBlank
    @Size(max = 10)
    String flightDate;

    @JsonProperty("DepAirport")
    @NotBlank
    @Size(max = 3)
    String depAirport;

    @JsonProperty("ArrAirport")
    @NotBlank
    @Size(max = 3)
    String arrAirport;

    @JsonProperty("DepAirportName")
    String depAirportName;

    @JsonProperty("ArrAirportName")
    String arrAirportName;

    @JsonProperty("FlightNo")
    @NotBlank
    @Size(max = 7)
    String flightNo;

    @JsonProperty("DepDateTime")
    @NotBlank
    @Size(max = 16)
    String depDateTime;

    @JsonProperty("ArrDateTime")
    @NotBlank
    @Size(max = 16)
    String arrDateTime;

    @JsonProperty("CodeShare")
    Boolean codeShare;

    @JsonProperty("CarrierNo")
    @NotBlank
    @Size(max = 7)
    String carrierNo;

    @JsonProperty("FType")
    @NotBlank
    @Size(max = 3)
    String fType;

    @JsonProperty("MealCode")
    @Size(max = 1)
    String mealCode;

    @JsonProperty("ASR")
    Boolean asr;

    @JsonProperty("StopNumber")
    @Size(max = 1)
    String stopNumber;

    @JsonProperty("DepTerm")
    @NotBlank
    @Size(max = 2)
    String depTerm;

    @JsonProperty("ArrTerm")
    @NotBlank
    @Size(max = 2)
    String arrTerm;

    @JsonProperty("ETkt")
    Boolean etkt;

    @JsonProperty("CabinFareList")
    @Valid
    @Singular
    List<CabinFare> cabinFareList;

    @JsonProperty("CabinCHDINFFareList")
    @Valid
    @Singular
    List<CabinFare> cabinCHDINFFareList;

    @JsonProperty("TransferDuration")
    @NotNull
    @PositiveOrZero
    Integer transferDuration;

    @JsonProperty("FlightSpanDay")
    @NotNull
    @PositiveOrZero
    Integer flightSpanDay;

    @JsonProperty("StopDuration")
    @NotNull
    @PositiveOrZero
    Integer stopDuration;

    @JsonProperty("Duration")
    @NotNull
    @PositiveOrZero
    Integer duration;
}
