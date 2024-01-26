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

    Address updateAddress(AddressDTO addressDTO, @MappingTarget Address address);

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
