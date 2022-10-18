package com.java.controller;

import com.java.domain.DTO.ProductImageInformationDTO;
import com.java.domain.base.BaseResponse;
import com.java.domain.base.BaseUtils;
import com.java.service.ProductImageInformationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-image-information/")
public class ProductImageInformationController {
    @Autowired
    private BaseUtils baseUtils;

    @Autowired
    private ProductImageInformationService productImageInformationService;

    @ApiOperation("Lấy danh sách tất cả ảnh")
    @GetMapping("find-all")
    public ResponseEntity<BaseResponse<List<ProductImageInformationDTO>>> getAllProductImageInformation() {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productImageInformationService.getAll()));
    }

    @ApiOperation("Tìm kiếm thông tin image bằng code")
    @GetMapping("find-by-code/{code}")
    public ResponseEntity<BaseResponse<ProductImageInformationDTO>> findByCode(@PathVariable String code) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productImageInformationService.getByCode(code)));
    }

    @ApiOperation("Tìm kiếm thông tin image bằng code sản phẩm")
    @GetMapping("find-by-code-product/{code}")
    public ResponseEntity<BaseResponse<List<ProductImageInformationDTO>>> findByCodeProduct(@PathVariable String code) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productImageInformationService.getAllProductByProductCode(code)));
    }

    @ApiOperation("Tìm kiếm thông tin image bằng code thông tin")
    @GetMapping("find-by-code-product-detail/{code}")
    public ResponseEntity<BaseResponse<List<ProductImageInformationDTO>>> findByCodeProductDetail(@PathVariable String code) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productImageInformationService.getAllProductByProductDetailCode(code)));
    }

    @ApiOperation("Tạo mới data ảnh")
    @PostMapping("create-product-image-information")
    public ResponseEntity<BaseResponse<ProductImageInformationDTO>> createProductImageInfo(@io.swagger.v3.oas.annotations.parameters.RequestBody ProductImageInformationDTO productImageInformationDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productImageInformationService.create(productImageInformationDTO)));
    }

    @ApiOperation("Chỉnh sửa data ảnh")
    @PutMapping("edit-product-image-information")
    public ResponseEntity<BaseResponse<ProductImageInformationDTO>> editProductImageInformation(@RequestBody ProductImageInformationDTO productImageInformationDTO) {
        return ResponseEntity.ok(baseUtils.buildSuccessResponse(productImageInformationService.edit(productImageInformationDTO)));
    }

    @ApiOperation("Xóa thông tin data ảnh")
    @DeleteMapping("delete-product-image-information/{code}")
    public ResponseEntity<BaseResponse<String>> deleteProductImageInformation(@PathVariable String code) {
        productImageInformationService.deleteByCode(code);
        return ResponseEntity.ok(baseUtils.buildSuccessResponse("SUCCESS"));
    }
}
