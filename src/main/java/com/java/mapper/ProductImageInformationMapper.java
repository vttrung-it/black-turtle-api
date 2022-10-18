package com.java.mapper;

import com.java.domain.DTO.ProductImageInformationDTO;
import com.java.domain.entity.ProductImageInformation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductImageInformationMapper extends BaseEntityMapper<ProductImageInformationDTO, ProductImageInformation> {
}
