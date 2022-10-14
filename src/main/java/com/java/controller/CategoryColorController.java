package com.java.controller;

import com.java.domain.DTO.CategoryColorDTO;
import com.java.domain.base.BaseResponse;
import com.java.domain.base.BaseUtils;
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

    @Autowired
    private BaseUtils baseUtils;

    @GetMapping("find-all")
    public ResponseEntity<BaseResponse<List<CategoryColorDTO>>> getAllCategory() {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryColorService.getAll()));
    }

    @GetMapping("find-by-id/{id}")
    public ResponseEntity<BaseResponse<CategoryColorDTO>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryColorService.getById(id)));
    }

    @PostMapping("create-category-color")
    public ResponseEntity<BaseResponse<CategoryColorDTO>> createCategoryColor(@RequestBody CategoryColorDTO categoryColorDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryColorService.create(categoryColorDTO)));
    }

    @PutMapping("edit-category-color")
    public ResponseEntity<BaseResponse<CategoryColorDTO>> editCategoryColor(@RequestBody CategoryColorDTO categoryColorDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryColorService.edit(categoryColorDTO)));
    }

    @DeleteMapping("delete-category-color/{id}")
    public ResponseEntity<BaseResponse<String>> deleteCategoryColor(@PathVariable Long id) {
        categoryColorService.delete(id);
        return ResponseEntity.ok(baseUtils.buildSuccessResponse("SUCCESS"));
    }
}
