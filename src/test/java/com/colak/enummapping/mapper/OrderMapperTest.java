package com.colak.enummapping.mapper;

import com.colak.enummapping.dto.OrderDTO;
import com.colak.enummapping.dto.OrderStatusDTO;
import com.colak.enummapping.model.Order;
import com.colak.enummapping.model.OrderStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderMapperTest {

    @Test
    void toDto() {
        Order order = new Order();
        order.setStatus(OrderStatus.PROCESSING);

        OrderDTO orderDTO = OrderMapper.INSTANCE.orderToOrderDTO(order);

        assertEquals(orderDTO.getStatus(), OrderStatusDTO.PENDING);

    }
}