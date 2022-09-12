package com.java.service.implement;

import com.java.domain.DTO.CategoryColorDTO;
import com.java.domain.entity.CategoryColor;
import com.java.mapper.CategoryColorMapper;
import com.java.repository.CategoryColorRepository;
import com.java.service.CategoryColorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryColorServiceImplement implements CategoryColorService {

    private final Logger logger = LoggerFactory.getLogger(CategoryColorServiceImplement.class);

    @Autowired
    private CategoryColorRepository categoryColorRepository;

    private final CategoryColorMapper categoryColorMapper;

    public CategoryColorServiceImplement(CategoryColorMapper categoryColorMapper) {
        this.categoryColorMapper = categoryColorMapper;
    }

    @Override
    public CategoryColorDTO getById(Long id) {
        return categoryColorMapper.toDto(categoryColorRepository.findByID(id));
    }

    @Override
    public List<CategoryColorDTO> getAll() {
        return categoryColorMapper.toDto(categoryColorRepository.findAll());
    }

    @Override
    public CategoryColorDTO create(CategoryColorDTO categoryColorDTO) {
        CategoryColor categoryColor = categoryColorRepository.save(categoryColorMapper.toEntity(categoryColorDTO));
        categoryColorDTO.setId(categoryColor.getId());
        return categoryColorDTO;
    }

    @Override
    public CategoryColorDTO edit(CategoryColorDTO categoryColorDTO) {
        Optional<CategoryColor> optional = categoryColorRepository.findById(categoryColorDTO.getId());
        if (optional.isPresent()) {
            CategoryColor update = optional.get();
            update.setName(categoryColorDTO.getName());
            update.setCodeColor(categoryColorDTO.getCodeColor());
            update.setDescription(categoryColorDTO.getDescription());
            categoryColorRepository.save(update);
        }
        return categoryColorMapper.toDto(categoryColorRepository.findByID(categoryColorDTO.getId()));
    }

    @Override
    public void delete(Long id) {
        categoryColorRepository.findById(id).ifPresent(categoryColorRepository::delete);
    }
}
