package com.java.mapper;

import com.java.domain.DTO.CategoryLinkDTO;
import com.java.domain.entity.CategoryLink;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryLinkMapper extends BaseEntityMapper<CategoryLinkDTO, CategoryLink>{
}
