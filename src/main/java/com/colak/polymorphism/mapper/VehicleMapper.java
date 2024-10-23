package com.colak.polymorphism.mapper;

import com.colak.polymorphism.dto.VehicleDTO;
import com.colak.polymorphism.model.Vehicle;
import org.mapstruct.Mapper;

@Mapper
public interface VehicleMapper {

    VehicleDTO vehicleToVehicleDTO(Vehicle vehicle);
}
