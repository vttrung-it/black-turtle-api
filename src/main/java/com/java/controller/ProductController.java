package com.java.controller;

import com.java.domain.DTO.ProductDTO;
import com.java.domain.base.BaseResponse;
import com.java.domain.base.BaseUtils;
import com.java.service.ProductService;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product/")
public class ProductController {

    @Autowired
    private BaseUtils baseUtils;

    @Autowired
    private ProductService productService;

    @ApiOperation("Lấy danh sách tất cả sản phẩm")
    @GetMapping("find-all")
    public ResponseEntity<BaseResponse<List<ProductDTO>>> getAllProduct() {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productService.getAll()));
    }

    @ApiOperation("Tìm kiếm sản phẩm bằng code")
    @GetMapping("find-by-code/{code}")
    public ResponseEntity<BaseResponse<ProductDTO>> findByCode(@PathVariable String code) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productService.getByCode(code)));
    }

    @ApiOperation("Tạo mới sản phẩm")
    @PostMapping("create-product")
    public ResponseEntity<BaseResponse<ProductDTO>> createProduct(@io.swagger.v3.oas.annotations.parameters.RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productService.create(productDTO)));
    }

    @ApiOperation("Chỉnh sửa sản phẩm")
    @PutMapping("edit-product")
    public ResponseEntity<BaseResponse<ProductDTO>> editProduct(@RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productService.edit(productDTO)));
    }

    @ApiOperation("Xóa sản phẩm bằng code")
    @DeleteMapping("delete-product/{code}")
    public ResponseEntity<BaseResponse<String>> deleteProduct(@PathVariable String code) {
        productService.deleteByCode(code);
        return ResponseEntity.ok(baseUtils.buildSuccessResponse("SUCCESS"));
    }
}
