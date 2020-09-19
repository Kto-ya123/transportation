package com.example.transportation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "PERSONAL_DATA")
public class PersonalData {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "NAME")
    public String name;

    @Column(name = "SURNAME")
    public String surname;

    @Column(name = "PHONE_NUMBER")
    public String phoneNumber;

    @OneToOne(mappedBy = "personalData")
    public UserCredentials userCredentials;
}
