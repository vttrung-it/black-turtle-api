package com.java.controller;

import com.java.domain.DTO.ProductDetailDTO;
import com.java.domain.base.BaseResponse;
import com.java.domain.base.BaseUtils;
import com.java.service.ProductDetailService;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-detail/")
public class ProductDetailController {
    @Autowired
    private BaseUtils baseUtils;

    @Autowired
    private ProductDetailService productDetailService;

    @ApiOperation("Lấy danh sách tất cả thông tin sản phẩm")
    @GetMapping("find-all")
    public ResponseEntity<BaseResponse<List<ProductDetailDTO>>> getAllProductDetail() {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productDetailService.getAll()));
    }

    @ApiOperation("Tìm kiếm thông tin sản phẩm bằng code thông tin")
    @GetMapping("find-by-code/{code}")
    public ResponseEntity<BaseResponse<ProductDetailDTO>> findByCode(@PathVariable String code) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productDetailService.getByCode(code)));
    }

    @ApiOperation("Tạo mới thông tin sản phẩm")
    @PostMapping("create-product-detail")
    public ResponseEntity<BaseResponse<ProductDetailDTO>> createProductDetail(@io.swagger.v3.oas.annotations.parameters.RequestBody ProductDetailDTO productDetailDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productDetailService.create(productDetailDTO)));
    }

    @ApiOperation("Chỉnh sửa thông tin sản phẩm")
    @PutMapping("edit-product-detail")
    public ResponseEntity<BaseResponse<ProductDetailDTO>> editProductDetail(@RequestBody ProductDetailDTO productDetailDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productDetailService.edit(productDetailDTO)));
    }

    @ApiOperation("Xóa thông tin sản phẩm bằng code")
    @DeleteMapping("delete-product-detail/{code}")
    public ResponseEntity<BaseResponse<String>> deleteProductDetail(@PathVariable String code) {
        productDetailService.deleteByCode(code);
        return ResponseEntity.ok(baseUtils.buildSuccessResponse("SUCCESS"));
    }
}
