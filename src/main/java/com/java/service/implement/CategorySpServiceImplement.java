package com.java.service.implement;

import com.java.domain.DTO.CategorySpDTO;
import com.java.domain.entity.CategorySp;
import com.java.mapper.CategorySpMapper;
import com.java.repository.CategorySpRepository;
import com.java.service.CategorySpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorySpServiceImplement implements CategorySpService {

    private final Logger logger = LoggerFactory.getLogger(CategorySpServiceImplement.class);
    @Autowired
    private CategorySpRepository categorySpRepository;

    private final CategorySpMapper categorySpMapper;

    public CategorySpServiceImplement(CategorySpMapper categorySpMapper) {
        this.categorySpMapper = categorySpMapper;
    }

    @Override
    public CategorySpDTO getById(Long id) {
        return categorySpMapper.toDto(categorySpRepository.findByID(id));
    }

    @Override
    public List<CategorySpDTO> getAll() {
        return categorySpMapper.toDto(categorySpRepository.findAll());
    }

    @Override
    public CategorySpDTO create(CategorySpDTO categorySpDTO) {
        CategorySp categorySp = categorySpRepository.save(categorySpMapper.toEntity(categorySpDTO));
        categorySpDTO.setId(categorySp.getId());
        return categorySpDTO;
    }

    @Override
    public CategorySpDTO edit(CategorySpDTO categorySpDTO) {
        Optional<CategorySp> optional = categorySpRepository.findById(categorySpDTO.getId());
        if (optional.isPresent()) {
            CategorySp update = optional.get();
            update.setName(categorySpDTO.getName());
            update.setDescription(categorySpDTO.getDescription());
            categorySpRepository.save(update);
        }
        return categorySpMapper.toDto(categorySpRepository.findByID(categorySpDTO.getId()));
    }

    @Override
    public void delete(Long id) {
        categorySpRepository.findById(id).ifPresent(categorySpRepository::delete);
    }
}
