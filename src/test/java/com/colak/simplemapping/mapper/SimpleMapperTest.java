package com.colak.simplemapping.mapper;


import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SimpleMapperTest {

    @Test
    void fromDto() {
        var simpleDTO = new SimpleDTO("Main Street", "New York");

        var mapper = SimpleMapper.INSTANCE;
        SimpleModel updatedModel = mapper.fromDto(simpleDTO);
        assertEquals("Main Street", updatedModel.getStreet());
    }

    @Test
    void fromDtoList() {
        var simpleDTO1 = new SimpleDTO("Main Street1", "New York1");
        var simpleDTO2 = new SimpleDTO("Main Street2", "New York2");
        List<SimpleDTO> dtoList = List.of(simpleDTO1, simpleDTO2);

        var mapper = SimpleMapper.INSTANCE;
        List<SimpleModel> simpleModelList = mapper.fromDtoList(dtoList);
        assertEquals(2, simpleModelList.size());

        SimpleModel first = simpleModelList.getFirst();
        assertEquals("Main Street1", first.getStreet());

        SimpleModel last = simpleModelList.getLast();
        assertEquals("Main Street2", last.getStreet());
    }

    @Test
    void fromDtoMap() {
        var simpleDTO1 = new SimpleDTO("Main Street1", "New York1");
        var simpleDTO2 = new SimpleDTO("Main Street2", "New York2");
        Map<Integer, SimpleDTO> dtoMap = Map.of(1, simpleDTO1, 2, simpleDTO2);

        var mapper = SimpleMapper.INSTANCE;
        Map<Integer, SimpleModel> simpleModelMap = mapper.fromDtoMap(dtoMap);
        assertEquals(2, simpleModelMap.size());

        SimpleModel first = simpleModelMap.get(1);
        assertEquals("Main Street1", first.getStreet());

        SimpleModel last = simpleModelMap.get(2);
        assertEquals("Main Street2", last.getStreet());
    }

    @Test
    void update() {
        var simpleDTO = new SimpleDTO("Main Street", "New York");
        SimpleModel simpleModel = new SimpleModel("Broadway", "New York");

        var mapper = SimpleMapper.INSTANCE;
        var updatedModel = mapper.update(simpleDTO, simpleModel);
        assertEquals("Main Street", updatedModel.getStreet());
    }
}
