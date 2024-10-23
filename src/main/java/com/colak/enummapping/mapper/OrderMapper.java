package com.colak.enummapping.mapper;

import com.colak.enummapping.dto.OrderDTO;
import com.colak.enummapping.dto.OrderStatusDTO;
import com.colak.enummapping.model.Order;
import com.colak.enummapping.model.OrderStatus;
import org.mapstruct.Mapper;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO orderToOrderDTO(Order order);

    @ValueMappings({
            @ValueMapping(source = "PROCESSING", target = "PENDING"),
            @ValueMapping(source = "SHIPPED", target = "COMPLETED"),
            @ValueMapping(source = "DELIVERED", target = "CANCELLED")
    })
    OrderStatusDTO mapOrderStatusToOrderStatusDTO(OrderStatus orderStatus);
}
