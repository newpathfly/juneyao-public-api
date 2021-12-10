package com.juneyao.api.model.common.base;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public abstract class BaseResponse extends BaseModel {
    
    @JsonProperty("ResultCode")
    @NotBlank
    String resultCode;

    @JsonProperty("ErrorInfo")
    @NotBlank
    String errorInfo;
}
