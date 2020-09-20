package com.example.transportation.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShowTripResponse implements Serializable {

    private Long id;
    private String arrivalCity;
    private String departureCity;
    private Date arrivalTime;
    private Date departureTime;
    private Long driverId;
    private Long carId;
    private Long organizationId;
}
