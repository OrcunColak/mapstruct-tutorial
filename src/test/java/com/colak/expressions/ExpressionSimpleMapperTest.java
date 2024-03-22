package com.colak.expressions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionSimpleMapperTest {
    @Test
    void testExpression() {
        var simpleDTO = new ExpressionSimpleDTO("Main Street", "New York", 100);

        var mapper = ExpressionSimpleMapper.INSTANCE;
        ExpressionSimpleModel simpleModel = mapper.fromDto(simpleDTO);
        assertEquals("New York Main Street", simpleModel.getAddress());
    }

    @Test
    void testDefaultValue() {
        // Create dto with null total
        var simpleDTO = new ExpressionSimpleDTO("Main Street", "New York", null);

        var mapper = ExpressionSimpleMapper.INSTANCE;
        ExpressionSimpleModel simpleModel = mapper.fromDto(simpleDTO);

        // Total field for model should be default value
        assertEquals(10, simpleModel.getTotal());
    }

}
