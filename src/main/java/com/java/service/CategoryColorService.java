package com.java.service;


import com.java.domain.DTO.CategoryColorDTO;

import java.util.List;

public interface CategoryColorService {

    CategoryColorDTO getById(Long id);

    List<CategoryColorDTO> getAll();

    CategoryColorDTO create(CategoryColorDTO categoryColorDTO);

    CategoryColorDTO edit(CategoryColorDTO categoryColorDTO);

    void delete(Long id);
}
