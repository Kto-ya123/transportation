package com.example.transportation.mapper;

import com.example.transportation.dto.ShowUserResponse;
import com.example.transportation.model.PersonalData;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<PersonalData, ShowUserResponse> {
    @Override
    ShowUserResponse entityToDto(PersonalData entity);
}
