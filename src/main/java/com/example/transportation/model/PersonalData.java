package com.example.transportation.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class PersonalData {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "name")
    public String name;

    @Column(name = "surname")
    public String surname;

    @Column(name = "phone_number")
    public String phoneNumber;

    @OneToOne(mappedBy = "personalData")
    public UserCredentials userCredentials;
}
