package com.example.transportation.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class UserCredentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String login;

    @Column
    public String password;

    @Column
    public String email;

    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    public Role role;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="personal_data_id")
    public PersonalData personalData;



}
