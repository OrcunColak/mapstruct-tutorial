package com.colak.simplemapping.mapper;


import com.colak.simplemapping.dto.SimpleDTO;
import com.colak.simplemapping.model.SimpleModel;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SimpleMapperTest {

    @Test
    void fromDto() {
        var simpleDTO = new SimpleDTO("Main Street", "New York");

        var simpleMapper = SimpleMapper.INSTANCE;
        SimpleModel updatedModel = simpleMapper.fromDto(simpleDTO);
        assertEquals("Main Street", updatedModel.getStreet());
    }

    @Test
    void fromDtoList() {
        var simpleDTO1 = new SimpleDTO("Main Street1", "New York1");
        var simpleDTO2 = new SimpleDTO("Main Street2", "New York2");
        List<SimpleDTO> dtoList = List.of(simpleDTO1, simpleDTO2);

        var simpleMapper = SimpleMapper.INSTANCE;
        List<SimpleModel> simpleModelList = simpleMapper.fromDtoList(dtoList);
        assertEquals(2, simpleModelList.size());


        SimpleModel first = simpleModelList.getFirst();
        assertEquals("Main Street1", first.getStreet());

        SimpleModel last = simpleModelList.getLast();
        assertEquals("Main Street2", last.getStreet());
    }

    @Test
    void update() {
        var simpleDTO = new SimpleDTO("Main Street", "New York");
        SimpleModel simpleModel = new SimpleModel("Broadway", "New York");

        var addressMapper = SimpleMapper.INSTANCE;
        var updatedModel = addressMapper.update(simpleDTO, simpleModel);
        assertEquals("Main Street", updatedModel.getStreet());
    }
}
