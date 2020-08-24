package com.example.transportation.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;

@Data
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "departure_time")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    public Date departureTime;

    @Column(name = "arrival_time")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    public Date arrivalTime;

    @Column(name = "departure_city")
    public String departureCity;

    @Column(name = "arrival_city")
    public String arrivalCity;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    public Organization organization;

}
