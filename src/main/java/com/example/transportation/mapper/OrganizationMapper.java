package com.example.transportation.mapper;

import com.example.transportation.dto.ShowOrganizationResponse;
import com.example.transportation.model.Organization;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrganizationMapper<E, D> extends BaseMapper<Organization, ShowOrganizationResponse> {
    @Override
    ShowOrganizationResponse entityToDto(Organization entity);
}
