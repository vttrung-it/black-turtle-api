package com.java.service;


import com.java.domain.DTO.ProductImageInformationDTO;

import java.util.List;

public interface ProductImageInformationService {

    ProductImageInformationDTO getByCode(String code);

    List<ProductImageInformationDTO> getAll();

    List<ProductImageInformationDTO> getAllProductByProductCode(String productCode);

    List<ProductImageInformationDTO> getAllProductByProductDetailCode(String productDetailCode);

    ProductImageInformationDTO create(ProductImageInformationDTO productImageInformationDTO);

    ProductImageInformationDTO edit(ProductImageInformationDTO productImageInformationDTO);

    void deleteByCode(String code);
}
