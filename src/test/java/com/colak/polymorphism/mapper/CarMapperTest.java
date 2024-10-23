package com.colak.polymorphism.mapper;

import com.colak.polymorphism.dto.CarDTO;
import com.colak.polymorphism.model.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarMapperTest {

    @Test
    void toDto() {
        Car car = new Car();
        car.setMake("2017");
        car.setNumberOfDoors(4);

        CarDTO carDTO = CarMapper.INSTANCE.carToCarDTO(car);
        assertEquals(4, carDTO.getNumberOfDoors());
    }

}