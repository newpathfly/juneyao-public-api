package com.juneyao.api.model.common;

import java.util.List;

import javax.validation.Valid;
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
public class Fare {

    @JsonProperty("FareID")
    @NotBlank
    @Size(max = 50)
    String fareId;

    @JsonProperty("PassengerType")
    @NotNull
    PassengerType passengerType;

    @JsonProperty("FareBasis")
    @NotBlank
    @Size(max = 20)
    String fareBasis;

    @JsonProperty("TourCode")
    @Size(max = 20)
    String tourCode;

    @JsonProperty("Baggage")
    @NotBlank
    @Size(max = 6)
    String baggage;

    @JsonProperty("PriceValue")
    @NotNull
    @PositiveOrZero
    Integer priceValue;

    @JsonProperty("RSP")
    @NotNull
    @PositiveOrZero
    Integer rsp;

    @JsonProperty("RefundedFlag")
    @NotNull
    Boolean refundedFlag;

    @JsonProperty("RefundedComment")
    @Size(max = 1000)
    String refundedComment;

    @JsonProperty("ChangeComment")
    @Size(max = 1000)
    String changeComment;

    @JsonProperty("RefundedRules")
    @Valid
    List<RefundRuleInfo> refundedRules;

    @JsonProperty("ChangeRules")
    @Valid
    List<ChangeRuleInfo> changeRules;

    @JsonProperty("PriceProductType")
    String priceProductType;

    @JsonProperty("TotalTax")
    @PositiveOrZero
    Integer totalTax;

    @JsonProperty("TaxInfo")
    @Valid
    FareTaxInfo taxInfo;

    @JsonProperty("priceValueComb")
    String priceValueComb;

    @JsonProperty("OtherTaxList")
    @Valid
    List<InternatTaxInfo> otherTaxList;

    @JsonProperty("HandBaggage")
    @Size(max = 1000)
    String handBaggage;

    @JsonProperty("HandBaggageRemark")
    @Size(max = 1000)
    String handBaggageRemark;

    @JsonProperty("CheckBaggage")
    @Size(max = 1000)
    String checkBaggage;

    @JsonProperty("CheckBaggageRemark")
    @Size(max = 1000)
    String checkBaggageRemark;
}
