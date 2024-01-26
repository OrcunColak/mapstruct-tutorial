package com.colak.nestedproperty.mapper;

import com.colak.nestedproperty.dto.StudentDto;
import com.colak.nestedproperty.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    // Target has nested field
    @Mapping(source = "className", target = "classVal")
    @Mapping(source = "subject", target = "subject.name")
    Student fromDto(StudentDto studentDto);

    // Source has nested field
    @Mapping(source = "classVal", target = "className")
    @Mapping(source = "subject.name", target = "subject")
    StudentDto toDto(Student studentEntity);

}
