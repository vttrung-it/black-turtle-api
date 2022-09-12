package com.java.controller;

import com.java.domain.DTO.CategorySpDTO;
import com.java.service.CategorySpService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category-sp/")
public class CategorySpController {

    @Autowired
    private CategorySpService categorySpService;

    @GetMapping("find-all")
    public List<CategorySpDTO> getAllCategory() {
        return categorySpService.getAll();
    }

    @GetMapping("find-by-id/{id}")
    public CategorySpDTO findById(@PathVariable Long id) {
        return categorySpService.getById(id);
    }

    @PostMapping("create-category-sp")
    public CategorySpDTO createCategorySp(@RequestBody CategorySpDTO categorySpDTO) {
        return categorySpService.create(categorySpDTO);
    }

    @PutMapping("edit-category-sp")
    public CategorySpDTO editCategorySp(@RequestBody CategorySpDTO categorySpDTO) {
        return categorySpService.edit(categorySpDTO);
    }

    @DeleteMapping("delete-category-sp/{id}")
    public void deleteCategorySp(@PathVariable Long id) {
        categorySpService.delete(id);
    }
}
