package com.example.transportation.mapper;

import com.example.transportation.dto.ShowCarResponse;
import com.example.transportation.model.Car;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper extends BaseMapper<Car, ShowCarResponse> {
    @Override
    ShowCarResponse entityToDto(Car entity);
}
