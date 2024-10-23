package com.colak.polymorphism.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CarDTO extends VehicleDTO {
    private int numberOfDoors;
}