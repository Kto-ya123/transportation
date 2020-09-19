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
@Table(name = "USER_CREDENTIALS")
public class UserCredentials {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String login;

    @Column
    public String password;

    @Column
    public String email;

    @Column(name = "ROLE")
    @Enumerated(value = EnumType.STRING)
    public Role role;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="PERSONAL_DATA_ID", referencedColumnName = "ID")
    public PersonalData personalData;
}
