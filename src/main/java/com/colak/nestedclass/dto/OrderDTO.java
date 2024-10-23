package com.colak.nestedclass.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {
    private List<ProductDTO> products;
    // Getters and setters
}
