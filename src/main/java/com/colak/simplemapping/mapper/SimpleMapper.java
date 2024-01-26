package com.colak.simplemapping.mapper;

import com.colak.simplemapping.dto.SimpleDTO;
import com.colak.simplemapping.model.SimpleModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SimpleMapper {
    SimpleMapper INSTANCE = Mappers.getMapper(SimpleMapper.class);

    SimpleModel fromDto(SimpleDTO addressDTO);

    SimpleModel updateAddress(SimpleDTO addressDTO, @MappingTarget SimpleModel address);

}
