package com.juneyao.api.model.shop;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.juneyao.api.model.common.FlightInfoCombApi;
import com.juneyao.api.model.common.Segment;
import com.juneyao.api.model.common.base.BaseRequest;
import com.juneyao.api.model.common.base.BaseResponse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;
import lombok.experimental.SuperBuilder;

public class SearchOne {

    private SearchOne() {
    }


    @Getter
    @Setter
    @NoArgsConstructor
    @SuperBuilder
    public static class FlightFareRequest extends BaseRequest {

        @JsonProperty("SegCondList")
        @NotEmpty
        @Valid
        @Singular("segment")
        List<Segment> segCondList;

        @JsonProperty("FareSource")
        @NotBlank
        String fareSource;
    }

    @Getter
    @Setter
    @SuperBuilder
    public static class FlightFareResponse extends BaseResponse {

        @JsonProperty("LangCode")
        @NotBlank
        @Size(max = 3)
        String langCode;

        @JsonProperty("InterFlag")
        @NotBlank
        @Size(max = 1)
        String interFlag;

        @JsonProperty("ReadRedis")
        String readRedis;

        @JsonProperty("QuerySearchone")
        Boolean querySearchone;

        @JsonProperty("FareSource")
        @NotBlank
        String fareSource;

        @JsonProperty("FlightInfoCombList")
        @NotEmpty
        @Valid
        @Singular("flightInfoComb")
        List<FlightInfoCombApi> flightInfoCombList;

        // @todo FareDic
    }
}
