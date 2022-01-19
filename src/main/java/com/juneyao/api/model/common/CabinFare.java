package com.juneyao.api.model.common;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

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
public class CabinFare {

    @JsonProperty("PassengerType")
    @NotNull
    PassengerType passengerType;

    @JsonProperty("PriceShowType")
    @Size(max = 10)
    String priceShowType;

    @JsonProperty("CabinCode")
    @Size(max = 2)
    String cabinCode;

    @JsonProperty("CabinNumber")
    @NotBlank
    @Size(max = 1)
    String cabinNumber;

    @JsonProperty("CabinClass")
    @NotBlank
    @Size(max = 1)
    String cabinClass;

    @JsonProperty("ReturnScore")
    @PositiveOrZero
    Integer returnScore;

    @JsonProperty("PriceValue")
    @PositiveOrZero
    Integer priceValue;

    @JsonProperty("FareKey")
    String fareKey;

    @JsonProperty("CabinComb")
    String cabinComb;

    @JsonProperty("PriceProductType")
    String priceProductType;
}
