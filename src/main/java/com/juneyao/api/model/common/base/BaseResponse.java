package com.juneyao.api.model.common.base;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseResponse extends BaseModel {
    
    @JsonProperty("ResultCode")
    @NotBlank
    String resultCode;

    @JsonProperty("ErrorInfo")
    @NotBlank
    String errorInfo;
}
