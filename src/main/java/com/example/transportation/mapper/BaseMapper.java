package com.example.transportation.mapper;

public interface BaseMapper<E, D> {
    D entityToDto(E entity);
}
