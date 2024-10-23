package com.colak.nestedclass.mapper;

import com.colak.nestedclass.dto.OrderDTO;
import com.colak.nestedclass.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = ProductMapper.class)
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO orderToOrderDTO(Order order);
}
