package com.java.mapper;

import com.java.domain.DTO.ProductDTO;
import com.java.domain.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends BaseEntityMapper<ProductDTO, Product> {
}
