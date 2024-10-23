# Nested Property

The original idea is from
https://www.tutorialspoint.com/mapstruct/mapstruct_mapping_nested_bean.htm

# Ignore Property

The original idea is from

https://medium.com/@nina.trausner/mapstruct-different-approaches-and-best-practices-282adbb96838

# @AfterMapping

The original idea is from  
https://raphaeldelio.medium.com/aftermapping-updating-lists-or-custom-objects-with-mapstruct-in-java-4a6f4622ef92

# Expressions and Default Values

The original idea is from  
https://medium.com/@tecnicorabi/mastering-mapstruct-for-efficient-java-bean-mappings-f03ddd9b511b

# source and target

```
@Mapper
public interface ProductMapper {

  @Mapping(source = "priceEuro", target = "price")
  Product productDTOToProduct(ProductDTO productDTO);
}
```

# ignore

```
@Mapper
public interface UserMapper {
  @Mapping(target = "id", ignore = true)
  UserDTO createUserDTOWithoutId(User user);
}
```

# expression

```
@Mapper
public interface ProductMapper {
   @Mapping(target = "totalPrice", expression = "java(product.getPrice() * 1.08)")
   ProductDTO productToProductDTO(Product product);
}
```

# lists

```
@Mapper
public interface ProductMapper {
  List<ProductDTO> productsToProductDTOs(List<Product> products);
}
```

# Nested Mapping
