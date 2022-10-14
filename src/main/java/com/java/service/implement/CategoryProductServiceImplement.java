package com.java.service.implement;

import com.java.domain.DTO.CategoryProductDTO;
import com.java.domain.entity.CategoryProduct;
import com.java.mapper.CategoryProductMapper;
import com.java.repository.CategoryProductRepository;
import com.java.service.CategoryProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryProductServiceImplement implements CategoryProductService {

    private final Logger logger = LoggerFactory.getLogger(CategoryProductServiceImplement.class);

    @Autowired
    private CategoryProductRepository categoryProductRepository;

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
    public void delete(String code) {
        categoryProductRepository.deleteCategoryProductByCode(code);
    }
}
