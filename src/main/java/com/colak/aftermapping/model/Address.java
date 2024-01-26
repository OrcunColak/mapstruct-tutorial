package com.colak.aftermapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Address {
    private List<Street> streets;
    private String city;

}
