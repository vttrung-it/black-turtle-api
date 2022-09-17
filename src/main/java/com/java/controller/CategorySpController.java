package com.java.controller;

import com.java.domain.DTO.CategorySpDTO;
import com.java.domain.base.BaseResponse;
import com.java.domain.base.BaseUtils;
import com.java.service.CategorySpService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category-sp/")
public class CategorySpController {

    @Autowired
    private CategorySpService categorySpService;

    @Autowired
    private BaseUtils baseUtils;

    @GetMapping("find-all")
    public ResponseEntity<BaseResponse<List<CategorySpDTO>>> getAllCategory() {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categorySpService.getAll()));
    }

    @GetMapping("find-by-id/{id}")
    public ResponseEntity<BaseResponse<CategorySpDTO>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categorySpService.getById(id)));
    }

    @PostMapping("create-category-sp")
    public ResponseEntity<BaseResponse<CategorySpDTO>> createCategorySp(@RequestBody CategorySpDTO categorySpDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categorySpService.create(categorySpDTO)));
    }

    @PutMapping("edit-category-sp")
    public ResponseEntity<BaseResponse<CategorySpDTO>> editCategorySp(@RequestBody CategorySpDTO categorySpDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categorySpService.edit(categorySpDTO)));
    }

    @DeleteMapping("delete-category-sp/{id}")
    public ResponseEntity<BaseResponse<String>> deleteCategorySp(@PathVariable Long id) {
        categorySpService.delete(id);
        return ResponseEntity.ok(baseUtils.buildSuccessResponse("SUCCESS"));
    }
}
