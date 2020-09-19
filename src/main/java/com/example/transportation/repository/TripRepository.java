package com.example.transportation.repository;

import com.example.transportation.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {

    @Query("SELECT trip FROM Trip trip WHERE trip.departureCity = :ds AND trip.arrivalCity = :as")
    List<Trip> findAllByDepartureCityAndArrivalCity(@Param("ds") String departureCity, @Param("as") String arrivalCity);

}
