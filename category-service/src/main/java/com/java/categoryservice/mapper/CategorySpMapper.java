package com.java.categoryservice.mapper;

import com.java.categoryservice.domain.DTO.CategorySpDTO;
import com.java.categoryservice.domain.entity.CategorySp;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategorySpMapper extends BaseEntityMapper<CategorySpDTO, CategorySp> {
}
