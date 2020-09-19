package com.example.transportation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

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
    private Long id;

    @Column(name = "DEPARTURE_TIME")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date departureTime;

    @Column(name = "ARRIVAL_TIME")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date arrivalTime;

    @Column(name = "DEPARTURE_CITY")
    private String departureCity;

    @Column(name = "ARRIVAL_CITY")
    private String arrivalCity;

    @Column(name = "COST")
    private Integer cost;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<UserCredentials> passengers;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;

    @ManyToOne
    @JoinColumn(name = "DRIVER_ID")
    private UserCredentials driver;
}
