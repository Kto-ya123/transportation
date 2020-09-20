package com.example.transportation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JoinPassengerRequest {

    @NotNull
    @JsonProperty("passenger_id")
    private Long passengerId;

    @NotNull
    @JsonProperty("trip_id")
    private Long tripId;
}
