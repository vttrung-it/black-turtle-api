package com.java.service;

import com.java.domain.DTO.ProductDetailDTO;

import java.util.List;

public interface ProductDetailService {
    ProductDetailDTO getByCode(String code);

    List<ProductDetailDTO> getAll();

    List<ProductDetailDTO> getAllProductDetailByProductCode(String productCode);

    ProductDetailDTO create(ProductDetailDTO productDetailDTO);

    ProductDetailDTO edit(ProductDetailDTO productDetailDTO);

    void deleteByCode(String code);
}
