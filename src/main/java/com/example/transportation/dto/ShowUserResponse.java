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
public class ShowUserResponse implements Serializable {

    private String name;
    private String surname;
    private String phoneNumber;
}
