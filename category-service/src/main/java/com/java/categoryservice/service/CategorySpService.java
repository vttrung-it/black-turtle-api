package com.java.categoryservice.service;

import com.java.categoryservice.domain.DTO.CategorySpDTO;
import com.java.categoryservice.domain.entity.CategorySp;

import java.util.List;

public interface CategorySpService {
    CategorySpDTO getById(Long id);
    List<CategorySpDTO> getAll();
    CategorySpDTO create(CategorySpDTO categorySpDTO);
    void update(CategorySpDTO categorySpDTO);
    boolean delete(Long id);
}
