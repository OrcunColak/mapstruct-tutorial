package com.colak.nestedproperty.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private int id;
    private String name;
    private String classVal;
    private Subject subject;
}
