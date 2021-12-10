package com.juneyao.api.model.common;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

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
