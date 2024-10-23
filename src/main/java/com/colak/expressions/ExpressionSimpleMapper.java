package com.colak.expressions;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
interface ExpressionSimpleMapper {

    ExpressionSimpleMapper INSTANCE = Mappers.getMapper(ExpressionSimpleMapper.class);

    // We can use expressions for complex mappings or to set default values
    @Mapping(target = "address", expression = "java(addressDTO.getAddress())")
    @Mapping(target = "total", defaultValue = "10")
    ExpressionSimpleModel fromDto(ExpressionSimpleDTO addressDTO);


}
