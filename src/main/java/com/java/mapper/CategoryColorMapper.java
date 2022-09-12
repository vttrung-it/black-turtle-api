package com.java.mapper;

import com.java.domain.DTO.CategoryColorDTO;
import com.java.domain.entity.CategoryColor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryColorMapper extends BaseEntityMapper<CategoryColorDTO, CategoryColor>{
}
