package com.colak.polymorphism.mapper;

import com.colak.polymorphism.dto.CarDTO;
import com.colak.polymorphism.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper extends VehicleMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDTO carToCarDTO(Car car);
}
