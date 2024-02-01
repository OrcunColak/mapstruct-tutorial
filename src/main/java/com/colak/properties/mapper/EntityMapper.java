package com.colak.properties.mapper;

import com.colak.properties.model.NewEntity;
import com.colak.properties.model.OldEntity;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EntityMapper {

    EntityMapper INSTANCE = Mappers.getMapper(EntityMapper.class);

    // Sometimes variables have different names.
    @Mapping(source = "name", target = "name1")
    // New fields are introduced to NewEntity
    @Mapping(target = "newField", ignore = true)
    // Types are different between OldEntity and NewEntity
    @Mapping(source = "listInteger", target = "listString", qualifiedByName = "mapList")
    @Mapping(source = "integerField", target = "stringField", qualifiedByName = "mapIntegerToString")
    NewEntity mapToNewEntity(OldEntity oldEntity);

    @Named("mapList")
    @IterableMapping(qualifiedByName = "mapIntegerToString")
    List<String> mapList(List<Integer> old);

    @Named("mapIntegerToString")
    default String mapIntegerToString(Integer integerField) {
        return String.valueOf(integerField);
    }
}
