package com.colak.simplemapping.mapper;

import com.colak.simplemapping.dto.SimpleDTO;
import com.colak.simplemapping.model.SimpleModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SimpleMapper {
    SimpleMapper INSTANCE = Mappers.getMapper(SimpleMapper.class);

    // We can convert a single item
    SimpleModel fromDto(SimpleDTO addressDTO);

    // We can convert a list of items
    List<SimpleModel> fromDtoList(List<SimpleDTO> addressDTOList);

    // We can update model from DTO
    SimpleModel update(SimpleDTO addressDTO, @MappingTarget SimpleModel address);

}
