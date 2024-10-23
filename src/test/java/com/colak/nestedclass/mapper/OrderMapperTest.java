package com.colak.nestedclass.mapper;

import com.colak.nestedclass.dto.OrderDTO;
import com.colak.nestedclass.dto.ProductDTO;
import com.colak.nestedclass.model.Order;
import com.colak.nestedclass.model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderMapperTest {

    @Test
    void toDto() {
        Order order = new Order();
        order.setId(1L);

        Product product = new Product();
        product.setId(1L);
        product.setName("product1");
        product.setPrice(10);
        List<Product> products = List.of(product);

        order.setProducts(products);

        OrderDTO orderDTO = OrderMapper.INSTANCE.orderToOrderDTO(order);
        List<ProductDTO> productDTOList = orderDTO.getProducts();
        ProductDTO productDTO = productDTOList.getFirst();
        assertEquals(productDTO.getName(), product.getName());
    }

}