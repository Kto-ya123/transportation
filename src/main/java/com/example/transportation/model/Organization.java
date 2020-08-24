package com.example.transportation.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "name")
    public String name;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "car_park")
    public Set<Car> carPark;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "trips")
    public Set<Trip> trips;

    @OneToOne
    @JoinColumn(name = "administrator_id")
    private UserCredentials administrator;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<UserCredentials> drivers;


}
