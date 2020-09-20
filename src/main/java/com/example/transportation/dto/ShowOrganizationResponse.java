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
public class ShowOrganizationResponse implements Serializable {

    private Long id;
    private String name;
    private String administrator_id;
}
