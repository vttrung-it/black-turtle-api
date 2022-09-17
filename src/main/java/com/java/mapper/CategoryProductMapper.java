package com.java.mapper;

import com.java.domain.DTO.CategoryProductDTO;
import com.java.domain.entity.CategoryProduct;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryProductMapper extends BaseEntityMapper<CategoryProductDTO, CategoryProduct> {
}
