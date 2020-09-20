package com.example.transportation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateTripRequest {

    @NotBlank
    @JsonProperty("arrival_city")
    private String arrivalCity;

    @NotBlank
    @JsonProperty("departure_city")
    private String departureCity;

    @NotNull
    @JsonProperty("arrival_time")
    private Date arrivalTime;

    @NotNull
    @JsonProperty("departure_time")
    private Date departureTime;

    @NotNull
    @JsonProperty("driver_id")
    private Long driverId;

    @NotNull
    @JsonProperty("car_id")
    private Long carId;

    @NotNull
    @JsonProperty("organization_id")
    private Long organizationId;
}
