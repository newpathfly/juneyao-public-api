package com.juneyao.api.model.common;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChangeRuleInfo {

    private ChangeRuleInfo() {
    }

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
