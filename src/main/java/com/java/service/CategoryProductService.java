package com.java.service;

import com.java.domain.DTO.CategoryProductDTO;

import java.util.List;

public interface CategoryProductService {

    CategoryProductDTO getByCode(String code);

    List<CategoryProductDTO> getAll();

    CategoryProductDTO create(CategoryProductDTO categoryProductDTO);

    CategoryProductDTO edit(CategoryProductDTO categoryProductDTO);

    void delete(String code);
}
