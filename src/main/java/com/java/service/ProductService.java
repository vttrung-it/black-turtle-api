package com.java.service;

import com.java.domain.DTO.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO getByCode(String code);

    List<ProductDTO> getAll();

    ProductDTO create(ProductDTO productDTO);

    ProductDTO edit(ProductDTO productDTO);

    void deleteByCode(String code);
}
