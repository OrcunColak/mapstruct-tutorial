package com.colak.polymorphism_subclassmapping.mapper;

import com.colak.polymorphism_subclassmapping.dto.PersonDTO;
import com.colak.polymorphism_subclassmapping.model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonMapperTest {

    @Test
    void toDto() {

        Person person = new Person();
        person.setId("1");
        person.setName("person1");
        PersonDTO personDTO = PersonMapper.INSTANCE.mapToPersonDTO(person);

        assertEquals("person1", personDTO.getName());

    }

}