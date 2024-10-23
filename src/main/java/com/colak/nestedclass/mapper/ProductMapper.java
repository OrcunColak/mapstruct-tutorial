package com.colak.nestedclass.mapper;

import com.colak.nestedclass.dto.ProductDTO;
import com.colak.nestedclass.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductDTO> productsToProductDTOs(List<Product> products);
}
