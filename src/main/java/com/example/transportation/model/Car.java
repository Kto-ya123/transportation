package com.example.transportation.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "vehicleNumber")
    public String vehicleNumber;

    @Column
    public String model;

    @Column
    public Integer capacity;

    @ManyToOne
    @JoinColumn(name = "organisation_id")
    public Organization organization;

    @OneToOne
    @JoinColumn(name = "car_id")
    public Car car;

    @OneToOne
    @JoinColumn(name = "driver")
    public UserCredentials driver;


}
