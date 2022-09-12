package com.java.mapper;

import com.java.domain.DTO.CategorySpDTO;
import com.java.domain.entity.CategorySp;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategorySpMapper extends BaseEntityMapper<CategorySpDTO, CategorySp> {
}
