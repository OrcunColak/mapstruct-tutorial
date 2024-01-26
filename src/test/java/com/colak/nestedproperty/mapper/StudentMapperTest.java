package com.colak.nestedproperty.mapper;

import com.colak.nestedproperty.dto.StudentDto;
import com.colak.nestedproperty.model.Student;
import com.colak.nestedproperty.model.Subject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentMapperTest {

    @Test
    void fromDto() {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(1);
        studentDto.setName("name");
        studentDto.setClassName("classname");
        studentDto.setSubject("subject");

        Student student = StudentMapper.INSTANCE.fromDto(studentDto);
        assertEquals("subject", student.getSubject().getName());
    }

    @Test
    void toDto() {
        Student student = new Student();
        student.setId(1);
        student.setName("name");
        student.setClassVal("classval");

        Subject subject = new Subject("subject");
        student.setSubject(subject);

        StudentDto studentDto = StudentMapper.INSTANCE.toDto(student);
        assertEquals("subject", studentDto.getSubject());
    }

}
