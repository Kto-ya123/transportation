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
    private Long id;

    @Column(name = "VEHICLE_NUMBER")
    private String vehicleNumber;

    @Column
    private String model;

    @Column
    private Integer capacity;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;
}
