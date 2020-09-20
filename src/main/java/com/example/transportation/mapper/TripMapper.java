package com.example.transportation.mapper;

import com.example.transportation.dto.ShowTripResponse;
import com.example.transportation.model.Trip;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TripMapper extends BaseMapper<Trip, ShowTripResponse> {

    @Override
    @Mapping(target = "organizationId", source = "organization.id")
    @Mapping(target = "carId", source = "car.id")
    @Mapping(target = "driverId", source = "driver.id")
    ShowTripResponse entityToDto(Trip entity);
}
