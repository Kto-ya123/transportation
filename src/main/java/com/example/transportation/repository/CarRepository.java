package com.example.transportation.repository;

import com.example.transportation.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findAllByOrganizationId(Long organizationId);
}
