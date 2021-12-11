package com.juneyao.api.model.common.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum QueryType {
    
    @JsonProperty("0")
    BY_CITY,

    @JsonProperty("1")
    BY_AIRPORT;
}
