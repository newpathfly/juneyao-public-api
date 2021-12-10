package com.juneyao.api.model.common.base;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.juneyao.api.model.common.enums.RouteType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public abstract class BaseModel {

    @JsonProperty("ChannelCode")
    @NotBlank
    @Size(max = 50)
    String channelCode;

    @JsonProperty("RouteType")
    @NotNull
    RouteType routeType;
}
