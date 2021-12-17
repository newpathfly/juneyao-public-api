package com.juneyao.api.model.common;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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
public class RefundRuleInfo {

    @JsonProperty("FlightTimeCondition")
    String flightTimeCondition;

    @JsonProperty("TimeConditionStart")
    @NotBlank
    String timeConditionStart;

    @JsonProperty("TimeConditionEnd")
    String timeConditionEnd;

    @JsonProperty("Fee")
    @NotNull
    Integer fee;
}
