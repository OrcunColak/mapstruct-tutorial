package com.colak.expressions.mapper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionSimpleMapperTest {
    @Test
    void fromDto() {
        // Create dto with null total
        var simpleDTO = new ExpressionSimpleDTO("Main Street", "New York", null);

        var mapper = ExpressionSimpleMapper.INSTANCE;
        ExpressionSimpleModel simpleModel = mapper.fromDto(simpleDTO);
        assertEquals("New York Main Street", simpleModel.getAddress());

        // Total field for model should be default value
        assertEquals(10, simpleModel.getTotal());
    }

}
