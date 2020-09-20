package com.example.transportation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {

    @NotBlank
    @JsonProperty("email")
    private String email;

    @NotBlank
    @JsonProperty("login")
    private String login;

    @NotBlank
    @JsonProperty("password")
    private String password;

    @NotBlank
    @JsonProperty("name")
    private String name;

    @NotBlank
    @JsonProperty("phone_number")
    private String phoneNumber;

    @NotBlank
    @JsonProperty("surname")
    private String surname;
}
