package com.example.transportation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "TRIP")
public class Trip {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "DEPARTURE_TIME")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    public Date departureTime;

    @Column(name = "ARRIVAL_TIME")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    public Date arrivalTime;

    @Column(name = "DEPARTURE_CITY")
    public String departureCity;

    @Column(name = "ARRIVAL_CITY")
    public String arrivalCity;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ORGANIZATION_ID")
    public Organization organization;

    @ManyToOne
    @JoinColumn(name = "DRIVER_ID")
    public UserCredentials driver;
}
