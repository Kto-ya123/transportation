package com.example.transportation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JoinDriverRequest {

    @NotNull
    @JsonProperty("driver_id")
    private Long driverId;

    @NotNull
    @JsonProperty("organization_id")
    private Long organizationId;
}
