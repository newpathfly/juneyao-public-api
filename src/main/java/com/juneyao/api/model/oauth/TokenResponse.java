package com.juneyao.api.model.oauth;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TokenResponse {

    @JsonProperty("access_token")
    @NotBlank
    String accessToken;

    @JsonProperty("token_type")
    @NotBlank
    String tokenType;

    @JsonProperty("expires_in")
    @NotBlank
    String expiresIn;

    @JsonProperty("scope")
    @NotBlank
    String scope;

    @JsonProperty("jti")
    @NotBlank
    String jti;
}
