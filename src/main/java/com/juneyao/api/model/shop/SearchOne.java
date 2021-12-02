package com.juneyao.api.model.shop;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.juneyao.api.model.common.Segment;
import com.juneyao.api.model.common.base.BaseRequest;
import com.juneyao.api.model.common.base.BaseResponse;
import com.juneyao.api.model.common.enums.PassengerType;
import com.juneyao.api.model.common.enums.QueryType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class SearchOne {

    private SearchOne() {
    }

    @Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FlightFareRequest extends BaseRequest {

        @JsonProperty("RandCode")
        @NotBlank
        @Size(max = 30)
        String randCode;

        @JsonProperty("IsAdvanced")
        @NotNull
        @Size(max = 3)
        @Default
        String isAdvanced = "";

        @JsonProperty("QueryType")
        QueryType queryType;

        @JsonProperty("SegCondList")
        @NotEmpty
        List<Segment> segCondList;

        @JsonProperty("ReadRedis")
        String readRedis;

        @JsonProperty("FareSource")
        @NotBlank
        String fareSource;

        @JsonProperty("PassengerType")
        PassengerType passengerType;

        @JsonProperty("VirtualType")
        @NotNull
        Boolean virtualType;

        @JsonProperty("SpecialFareType")
        String specialFareType;
    }

    @Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FlightFareResponse extends BaseResponse {

        @JsonProperty("RandCode")
        @NotBlank
        @Size(max = 30)
        String randCode;
    }
}
