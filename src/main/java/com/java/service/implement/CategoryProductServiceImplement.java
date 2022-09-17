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
    public CategoryProductDTO getById(Long id) {
        return categoryProductMapper.toDto(categoryProductRepository.findByID(id));
    }

    @Override
    public List<CategoryProductDTO> getAll() {
        return categoryProductMapper.toDto(categoryProductRepository.findAll());
    }

    @Override
    public CategoryProductDTO create(CategoryProductDTO categoryProductDTO) {
        CategoryProduct categoryProduct = categoryProductRepository.save(categoryProductMapper.toEntity(categoryProductDTO));
        categoryProductDTO.setId(categoryProduct.getId());
        return categoryProductDTO;
    }

    @Override
    public CategoryProductDTO edit(CategoryProductDTO categoryProductDTO) {
        Optional<CategoryProduct> optional = categoryProductRepository.findById(categoryProductDTO.getId());
        if (optional.isPresent()) {
            CategoryProduct update = optional.get();
            update.setName(categoryProductDTO.getName());
            update.setCode(categoryProductDTO.getCode());
            update.setBrandName(categoryProductDTO.getBrandName());
            update.setOrigin(categoryProductDTO.getOrigin());
            update.setAddress(categoryProductDTO.getAddress());
            update.setDescription(categoryProductDTO.getDescription());
            categoryProductRepository.save(update);
        }
        return categoryProductMapper.toDto(categoryProductRepository.findByID(categoryProductDTO.getId()));
    }

    @Override
    public void delete(Long id) {
        categoryProductRepository.findById(id).ifPresent(categoryProductRepository::delete);
    }
}
