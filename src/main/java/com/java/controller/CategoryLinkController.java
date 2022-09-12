package com.java.controller;

import com.java.domain.DTO.CategoryLinkDTO;
import com.java.service.CategoryLinkService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category-link/")
public class CategoryLinkController {

    @Autowired
    private CategoryLinkService categoryLinkService;

    @GetMapping("find-all")
    public List<CategoryLinkDTO> getAllCategory() {
        return categoryLinkService.getAll();
    }

    @GetMapping("find-by-id/{id}")
    public CategoryLinkDTO findById(@PathVariable Long id) {
        return categoryLinkService.getById(id);
    }

    @PostMapping("create-category-link")
    public CategoryLinkDTO createCategoryLink(@RequestBody CategoryLinkDTO categoryLinkDTO) {
        return categoryLinkService.create(categoryLinkDTO);
    }

    @PutMapping("edit-category-link")
    public CategoryLinkDTO editCategoryLink(@RequestBody CategoryLinkDTO categoryLinkDTO) {
        return categoryLinkService.edit(categoryLinkDTO);
    }

    @DeleteMapping("delete-category-link/{id}")
    public void deleteCategoryLink(@PathVariable Long id) {
        categoryLinkService.delete(id);
    }
}
