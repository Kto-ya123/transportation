package com.example.transportation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name="ORGANIZATION")
public class Organization {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String name;

    @OneToMany(
            fetch = FetchType.EAGER,
            mappedBy = "organization",
            cascade = CascadeType.REMOVE)
    public Set<Car> carPark;

    @OneToMany(
            fetch = FetchType.EAGER,
            mappedBy = "organization",
            cascade = CascadeType.REMOVE)
    public Set<Trip> trips;

    @OneToOne
    @JoinColumn(name = "ADMINISTRATOR_ID")
    private UserCredentials administrator;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<UserCredentials> drivers;
}
