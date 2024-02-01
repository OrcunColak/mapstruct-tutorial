package com.colak.properties.model;

import lombok.Data;

import java.util.List;

@Data
public class NewEntity{
    private String name1;
    private String description;
    private String newField;
    private String stringField;
    private List<String> listString;
}