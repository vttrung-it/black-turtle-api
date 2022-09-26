package com.java.controller;

import com.java.domain.DTO.CategoryLinkDTO;
import com.java.domain.base.BaseResponse;
import com.java.domain.base.BaseUtils;
import com.java.service.CategoryLinkService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category-link/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryLinkController {

    @Autowired
    private CategoryLinkService categoryLinkService;

    @Autowired
    private BaseUtils baseUtils;

    @GetMapping("find-all")
    public ResponseEntity<BaseResponse<List<CategoryLinkDTO>>> getAllCategory() {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryLinkService.getAll()));
    }

    @GetMapping("find-by-id/{id}")
    public ResponseEntity<BaseResponse<CategoryLinkDTO>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryLinkService.getById(id)));
    }

    @PostMapping("create-category-link")
    public ResponseEntity<BaseResponse<CategoryLinkDTO>> createCategoryLink(@RequestBody CategoryLinkDTO categoryLinkDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryLinkService.create(categoryLinkDTO)));
    }

    @PutMapping("edit-category-link")
    public ResponseEntity<BaseResponse<CategoryLinkDTO>> editCategoryLink(@RequestBody CategoryLinkDTO categoryLinkDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryLinkService.edit(categoryLinkDTO)));
    }

    @DeleteMapping("delete-category-link/{id}")
    public ResponseEntity<BaseResponse<String>> deleteCategoryLink(@PathVariable Long id) {
        categoryLinkService.delete(id);
        return ResponseEntity.ok(baseUtils.buildSuccessResponse("SUCCESS"));
    }
}
