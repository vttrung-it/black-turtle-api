package com.java.service;

import com.java.domain.DTO.CategoryProductDTO;
import com.java.domain.base.BaseResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryProductService {

    CategoryProductDTO getByCode(String code);

    List<CategoryProductDTO> getAll();

    CategoryProductDTO create(CategoryProductDTO categoryProductDTO);

    CategoryProductDTO edit(CategoryProductDTO categoryProductDTO);

    ResponseEntity<BaseResponse<String>> delete(String code);
}
