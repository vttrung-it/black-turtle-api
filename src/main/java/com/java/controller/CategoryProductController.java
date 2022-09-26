package com.java.controller;

import com.java.domain.DTO.CategoryProductDTO;
import com.java.domain.base.BaseResponse;
import com.java.domain.base.BaseUtils;
import com.java.service.CategoryProductService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category-product/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryProductController {

    @Autowired
    private BaseUtils baseUtils;

    @Autowired
    private CategoryProductService categoryProductService;

    @GetMapping("find-all")
    public ResponseEntity<BaseResponse<List<CategoryProductDTO>>> getAllCategory() {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryProductService.getAll()));
    }

    @GetMapping("find-by-id/{id}")
    public ResponseEntity<BaseResponse<CategoryProductDTO>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryProductService.getById(id)));
    }

    @GetMapping("find-by-code/{code}")
    public ResponseEntity<BaseResponse<CategoryProductDTO>> findByCode(@PathVariable String code) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryProductService.getByCode(code)));
    }

    @PostMapping("create-category-product")
    public ResponseEntity<BaseResponse<CategoryProductDTO>> createCategoryProduct(@RequestBody CategoryProductDTO categoryProductDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryProductService.create(categoryProductDTO)));
    }

    @PutMapping("edit-category-product")
    public ResponseEntity<BaseResponse<CategoryProductDTO>> editCategoryProduct(@RequestBody CategoryProductDTO categoryProductDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryProductService.edit(categoryProductDTO)));
    }

    @DeleteMapping("delete-category-product/{id}")
    public ResponseEntity<BaseResponse<String>> deleteCategoryProduct(@PathVariable Long id) {
        categoryProductService.delete(id);
        return ResponseEntity.ok(baseUtils.buildSuccessResponse("SUCCESS"));
    }
}
