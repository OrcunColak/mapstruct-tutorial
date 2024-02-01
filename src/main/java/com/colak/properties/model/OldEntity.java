package com.colak.properties.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class OldEntity{
    private String name;
    private String description;
    private Integer integerField;
    private List<Integer> listInteger;

}
