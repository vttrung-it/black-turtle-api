package com.java.service;

import com.java.domain.DTO.CategoryLinkDTO;

import java.util.List;

public interface CategoryLinkService {

    CategoryLinkDTO getById(Long id);

    List<CategoryLinkDTO> getAll();

    CategoryLinkDTO create(CategoryLinkDTO categoryLinkDTO);

    CategoryLinkDTO edit(CategoryLinkDTO categoryLinkDTO);

    void delete(Long id);
}
