package com.example.transportation.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {

    @NotBlank
    @JsonProperty("model")
    private String model;

    @NotBlank
    @JsonProperty("vehicle_number")
    private String vehicleNumber;

    @NotNull
    @JsonProperty("capacity")
    private Integer capacity;

    @NotNull
    @JsonProperty("organization_id")
    private Long organizationId;
}
