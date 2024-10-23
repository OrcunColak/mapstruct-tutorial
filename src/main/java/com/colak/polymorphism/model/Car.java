package com.colak.polymorphism.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Car extends Vehicle {
    private int numberOfDoors;
}