package com.java.controller;

import com.java.domain.DTO.CategoryProductDTO;
import com.java.domain.base.BaseResponse;
import com.java.domain.base.BaseUtils;
import com.java.service.CategoryProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category-product/")
public class CategoryProductController {

    @Autowired
    private BaseUtils baseUtils;

    @Autowired
    private CategoryProductService categoryProductService;

    @ApiOperation("Lấy danh sách tất cả dòng sản phẩm")
    @GetMapping("find-all")
    public ResponseEntity<BaseResponse<List<CategoryProductDTO>>> getAllCategory() {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryProductService.getAll()));
    }

    @ApiOperation("Tìm kiếm dòng sản phẩm bằng code")
    @GetMapping("find-by-code/{code}")
    public ResponseEntity<BaseResponse<CategoryProductDTO>> findByCode(@PathVariable String code) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryProductService.getByCode(code)));
    }

    @ApiOperation("Tạo mới dòng sản phẩm")
    @PostMapping("create-category-product")
    public ResponseEntity<BaseResponse<CategoryProductDTO>> createCategoryProduct(@RequestBody CategoryProductDTO categoryProductDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryProductService.create(categoryProductDTO)));
    }

    @ApiOperation("Chỉnh sửa dòng sản phẩm")
    @PutMapping("edit-category-product")
    public ResponseEntity<BaseResponse<CategoryProductDTO>> editCategoryProduct(@RequestBody CategoryProductDTO categoryProductDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(categoryProductService.edit(categoryProductDTO)));
    }

    @ApiOperation("Xóa dòng sản phẩm bằng code")
    @DeleteMapping("delete-category-product/{code}")
    public ResponseEntity<BaseResponse<String>> deleteCategoryProduct(@PathVariable String code) {
        categoryProductService.delete(code);
        return ResponseEntity.ok(baseUtils.buildSuccessResponse("SUCCESS"));
    }
}
