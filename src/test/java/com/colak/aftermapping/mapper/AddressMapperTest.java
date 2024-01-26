package com.colak.aftermapping.mapper;


import com.colak.aftermapping.dto.AddressDTO;
import com.colak.aftermapping.model.Address;
import com.colak.aftermapping.model.Street;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AddressMapperTest {

    @Test
    void testMapper() {
        var addressDTO = new AddressDTO("Main Street", "New York");

        var addressMapper = AddressMapper.INSTANCE;
        var updatedAddress = addressMapper.fromDto(addressDTO);
        assertEquals("Main Street", updatedAddress.getStreets().getFirst().getStreetName());
    }

    @Test
    void testUpdate() {
        var addressDTO = new AddressDTO("Main Street", "New York");

        Street street = new Street("Broadway");
        var address = new Address(List.of(street), "New York");

        var addressMapper = AddressMapper.INSTANCE;
        var updatedAddress = addressMapper.update(addressDTO, address);
        assertEquals("Main Street", updatedAddress.getStreets().getFirst().getStreetName());
    }
}
