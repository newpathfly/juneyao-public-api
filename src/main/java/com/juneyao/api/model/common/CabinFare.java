package com.juneyao.api.model.common;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.juneyao.api.model.common.enums.PassengerType;

public class CabinFare {
    
    private CabinFare() {}

    @JsonProperty("PassengerType")
    @NotBlank
    PassengerType passengerType;

    @JsonProperty("CabinNumber")
    @NotBlank
    @Size(max = 1)
    String cabinNumber;

    @JsonProperty("CabinClass")
    @NotBlank
    @Size(max = 1)
    String cabinClass;

    @JsonProperty("PriceValue")
    @NotNull
    @PositiveOrZero
    Integer priceValue;

    @JsonProperty("FareKey")
    @NotBlank
    String fareKey;

    @JsonProperty("CabinComb")
    String cabinComb;

    @JsonProperty("PriceProductType")
    @NotBlank
    String priceProductType;
}
