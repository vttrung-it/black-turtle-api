package com.java.service;

import com.java.domain.DTO.CategorySpDTO;

import java.util.List;

public interface CategorySpService {

    CategorySpDTO getById(Long id);

    List<CategorySpDTO> getAll();

    CategorySpDTO create(CategorySpDTO categorySpDTO);

    CategorySpDTO edit(CategorySpDTO categorySpDTO);

    void delete(Long id);
}
