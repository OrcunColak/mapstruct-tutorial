package com.colak.polymorphism_subclassmapping.dto;

import lombok.Data;

@Data
public class StudentDTO extends PersonDTO {
    private String registrationNo;
}
