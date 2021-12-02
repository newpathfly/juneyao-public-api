package com.juneyao.api.model.common.base;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.juneyao.api.model.common.enums.RouteType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseModel {
    
    @JsonProperty("Version")
    @NotBlank
    @Size(max = 2)
    String version;

    @JsonProperty("ChannelCode")
    @NotBlank
    @Size(max = 50)
    String channelCode;

    @JsonProperty("UserNo")
    @NotBlank
    @Size(max = 10)
    String userNo;

    @JsonProperty("RouteType")
    @NotNull
    RouteType routeType;

    @JsonProperty("CurrencyCode")
    @NotBlank
    @Size(max = 3)
    String currency = "USD";

    @JsonProperty("LangCode")
    @NotBlank
    @Size(max = 3)
    String langCode = "EN";
}
