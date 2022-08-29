package com.java.categoryservice.service.implement;

import com.java.categoryservice.domain.DTO.CategorySpDTO;
import com.java.categoryservice.domain.entity.CategorySp;
import com.java.categoryservice.mapper.CategorySpMapper;
import com.java.categoryservice.repository.CategorySpRepository;
import com.java.categoryservice.service.CategorySpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImplement implements CategorySpService {

    private final Logger logger = LoggerFactory.getLogger(CategorySpService.class);
    @Autowired
    private CategorySpRepository categorySpRepository;

    private CategorySpMapper categorySpMapper;

    public CategoryServiceImplement(CategorySpMapper categorySpMapper) {
        this.categorySpMapper = categorySpMapper;
    }

    @Override
    public CategorySpDTO getById(Long id) {
        return null;
    }

    @Override
    public List<CategorySpDTO> getAll() {
        List<CategorySpDTO> categorySpDTOList = categorySpMapper.toDto(categorySpRepository.findAll());
        return categorySpDTOList;
    }

    @Override
    public CategorySpDTO create(CategorySpDTO categorySpDTO) {
        return null;
    }

    @Override
    public void update(CategorySpDTO categorySpDTO) {

    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
