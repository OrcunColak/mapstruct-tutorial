package com.colak.aftermapping.mapper;

import com.colak.aftermapping.model.Address;
import com.colak.aftermapping.dto.AddressDTO;
import com.colak.aftermapping.model.Street;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address fromDto(AddressDTO addressDTO);

    Address update(AddressDTO addressDTO, @MappingTarget Address address);

    // It is also possible to modify the data to be mapped
    // 1. before the mapping and
    // 2. the result after the mapping
    @AfterMapping
    default void updateStreets(AddressDTO addressDTO, @MappingTarget Address address) {
        if (address.getStreets() == null) {
            Street street = new Street(addressDTO.getStreet());
            ArrayList<Street> list = new ArrayList<>(List.of(street));
            address.setStreets(list);
        } else {
            address.getStreets().forEach(street -> street.setStreetName(addressDTO.getStreet()));
        }
    }
}
