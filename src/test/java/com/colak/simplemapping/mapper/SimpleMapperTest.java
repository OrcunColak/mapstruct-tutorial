package com.colak.simplemapping.mapper;


import com.colak.simplemapping.dto.SimpleDTO;
import com.colak.simplemapping.model.SimpleModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SimpleMapperTest {

    @Test
    void testMapper() {
        var simpleDTO = new SimpleDTO("Main Street", "New York");

        var simpleMapper = SimpleMapper.INSTANCE;
        SimpleModel updatedModel = simpleMapper.fromDto(simpleDTO);
        assertEquals("Main Street", updatedModel.getStreet());
    }

    @Test
    void testUpdate() {
        var simpleDTO = new SimpleDTO("Main Street", "New York");
        SimpleModel simpleModel = new SimpleModel("Broadway", "New York");

        var addressMapper = SimpleMapper.INSTANCE;
        var updatedModel = addressMapper.updateAddress(simpleDTO, simpleModel);
        assertEquals("Main Street", updatedModel.getStreet());
    }
}
