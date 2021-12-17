package com.juneyao.api.model.common;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

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
public class InternatTaxInfo {

    @JsonProperty("TaxCode")
    @NotBlank
    @Size(max = 10)
    String taxCode;

    @JsonProperty("Currency")
    @NotBlank
    String currency;

    @JsonProperty("TaxAmount")
    @NotNull
    @PositiveOrZero
    Integer taxAmount;

    @JsonProperty("TaxSuffix")
    String taxSuffix;

    @JsonProperty("TaxSeq")
    @NotNull
    Integer taxSeq;
}
