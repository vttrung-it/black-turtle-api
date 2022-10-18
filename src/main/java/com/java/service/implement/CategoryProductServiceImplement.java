package com.java.service.implement;

import com.java.domain.DTO.CategoryProductDTO;
import com.java.domain.DTO.ProductDTO;
import com.java.domain.base.BaseResponse;
import com.java.domain.base.BaseUtils;
import com.java.domain.entity.CategoryProduct;
import com.java.mapper.CategoryProductMapper;
import com.java.repository.CategoryProductRepository;
import com.java.service.CategoryProductService;
import com.java.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryProductServiceImplement implements CategoryProductService {

    @Autowired
    private CategoryProductRepository categoryProductRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private BaseUtils baseUtils;

    private final CategoryProductMapper categoryProductMapper;

    public CategoryProductServiceImplement(CategoryProductMapper categoryProductMapper) {
        this.categoryProductMapper = categoryProductMapper;
    }

    @Override
    public CategoryProductDTO getByCode(String code) {
        return categoryProductMapper.toDto(categoryProductRepository.findByCode(code));
    }

    @Override
    public List<CategoryProductDTO> getAll() {
        return categoryProductMapper.toDto(categoryProductRepository.findAll());
    }

    @Override
    public CategoryProductDTO create(CategoryProductDTO categoryProductDTO) {
        CategoryProduct categoryProduct = categoryProductRepository.save(categoryProductMapper.toEntity(categoryProductDTO));
        return categoryProductMapper.toDto(categoryProduct);
    }

    @Override
    public CategoryProductDTO edit(CategoryProductDTO categoryProductDTO) {
        CategoryProduct categoryProduct = categoryProductRepository.findByCode(categoryProductDTO.getCode());
        if (categoryProduct != null) {
            categoryProduct.setName(categoryProductDTO.getName());
            categoryProduct.setCode(categoryProductDTO.getCode());
            categoryProduct.setBrandName(categoryProductDTO.getBrandName());
            categoryProduct.setOrigin(categoryProductDTO.getOrigin());
            categoryProduct.setAddress(categoryProductDTO.getAddress());
            categoryProduct.setDescription(categoryProductDTO.getDescription());
            categoryProductRepository.save(categoryProduct);
        }
        return categoryProductMapper.toDto(categoryProductRepository.findByCode(categoryProduct.getCode()));
    }

    @Override
    public ResponseEntity<BaseResponse<String>> delete(String code) {
        List<ProductDTO> productDTOList = productService.getAllProductByCategoryProductCode(code);
        if (productDTOList != null && productDTOList.size() > 0) {
            return ResponseEntity.ok(baseUtils.buildErrorResponse("Tồn tại sản phẩm theo mã sản phẩm này", "ERROR"));
        }
        CategoryProduct categoryProductDTOList = categoryProductRepository.findByCode(code);
        if (categoryProductDTOList != null) {
            categoryProductRepository.deleteCategoryProductByCode(code);
            return ResponseEntity.ok(baseUtils.buildSuccessResponse("SUCCESS"));
        }
        return ResponseEntity.ok(baseUtils.buildErrorResponse("Không tồn tại dòng sản phẩm này", "ERROR"));
    }
}
