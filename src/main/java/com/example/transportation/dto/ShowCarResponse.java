package com.example.transportation.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShowCarResponse implements Serializable {

    private Long carId;
    private String model;
    private String vehicleNumber;
    private Integer capacity;
    private Long organizationId;
}
