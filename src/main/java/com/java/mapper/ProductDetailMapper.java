package com.java.mapper;

import com.java.domain.DTO.ProductDetailDTO;
import com.java.domain.entity.ProductDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductDetailMapper extends BaseEntityMapper<ProductDetailDTO, ProductDetail> {
}
