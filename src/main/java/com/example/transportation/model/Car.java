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
@Table(name="CAR")
public class Car {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "VEHICLE_NUMBER")
    public String vehicleNumber;

    @Column
    public String model;

    @Column
    public Integer capacity;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ORGANIZATION_ID")
    public Organization organization;
}
