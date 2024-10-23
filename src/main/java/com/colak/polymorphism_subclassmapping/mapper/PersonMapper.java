package com.colak.polymorphism_subclassmapping.mapper;

import com.colak.polymorphism_subclassmapping.dto.PersonDTO;
import com.colak.polymorphism_subclassmapping.dto.StudentDTO;
import com.colak.polymorphism_subclassmapping.model.Person;
import com.colak.polymorphism_subclassmapping.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.SubclassMapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @SubclassMapping(source = Student.class, target = StudentDTO.class)
    PersonDTO mapToPersonDTO(Person person);
}
