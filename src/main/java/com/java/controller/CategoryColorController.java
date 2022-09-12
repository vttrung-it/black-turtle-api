package com.java.controller;

import com.java.domain.DTO.CategoryColorDTO;
import com.java.service.CategoryColorService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category-color/")
public class CategoryColorController {

    @Autowired
    private CategoryColorService categoryColorService;

    @GetMapping("find-all")
    public List<CategoryColorDTO> getAllCategory() {
        return categoryColorService.getAll();
    }

    @GetMapping("find-by-id/{id}")
    public ResponseEntity<CategoryColorDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(categoryColorService.getById(id));
    }

    @PostMapping("create-category-color")
    public CategoryColorDTO createCategoryColor(@RequestBody CategoryColorDTO categoryColorDTO) {
        return categoryColorService.create(categoryColorDTO);
    }

    @PutMapping("edit-category-color")
    public CategoryColorDTO editCategoryColor(@RequestBody CategoryColorDTO categoryColorDTO) {
        return categoryColorService.edit(categoryColorDTO);
    }

    @DeleteMapping("delete-category-color/{id}")
    public void deleteCategoryColor(@PathVariable Long id) {
        categoryColorService.delete(id);
    }
}
