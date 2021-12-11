package com.juneyao.api.model.common;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.juneyao.api.model.common.enums.PassengerType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FareTaxInfo {
    
    private FareTaxInfo() {
    }

    @JsonProperty("PassengerType")
    @NotNull
    PassengerType passengerType;

    @JsonProperty("CNTax")
    @NotNull
    @PositiveOrZero
    Integer cnTax;

    @JsonProperty("YQTax")
    @NotNull
    @PositiveOrZero
    Integer yqTax;

    @JsonProperty("QTax")
    @NotNull
    @PositiveOrZero
    Integer qTax;

    @JsonProperty("OtherTax")
    @NotNull
    @PositiveOrZero
    Integer otherTax;
}
