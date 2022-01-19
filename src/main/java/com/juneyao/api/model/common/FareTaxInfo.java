package com.juneyao.api.model.common;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.juneyao.api.model.common.enums.PassengerType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FareTaxInfo {

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
