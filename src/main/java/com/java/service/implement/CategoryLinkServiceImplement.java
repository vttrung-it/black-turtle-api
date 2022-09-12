package com.java.service.implement;

import com.java.domain.DTO.CategoryLinkDTO;
import com.java.domain.entity.CategoryLink;
import com.java.mapper.CategoryLinkMapper;
import com.java.repository.CategoryLinkRepository;
import com.java.service.CategoryLinkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryLinkServiceImplement implements CategoryLinkService {

    private final Logger logger = LoggerFactory.getLogger(CategoryLinkServiceImplement.class);

    @Autowired
    private CategoryLinkRepository categoryLinkRepository;

    private final CategoryLinkMapper categoryLinkMapper;

    public CategoryLinkServiceImplement(CategoryLinkMapper categoryLinkMapper) {
        this.categoryLinkMapper = categoryLinkMapper;
    }

    @Override
    public CategoryLinkDTO getById(Long id) {
        return categoryLinkMapper.toDto(categoryLinkRepository.findByID(id));
    }

    @Override
    public List<CategoryLinkDTO> getAll() {
        return categoryLinkMapper.toDto(categoryLinkRepository.findAll());
    }

    @Override
    public CategoryLinkDTO create(CategoryLinkDTO categoryLinkDTO) {
        CategoryLink categoryLink = categoryLinkRepository.save(categoryLinkMapper.toEntity(categoryLinkDTO));
        categoryLinkDTO.setId(categoryLink.getId());
        return categoryLinkDTO;
    }

    @Override
    public CategoryLinkDTO edit(CategoryLinkDTO categoryLinkDTO) {
        Optional<CategoryLink> optional = categoryLinkRepository.findById(categoryLinkDTO.getId());
        if (optional.isPresent()) {
            CategoryLink update = optional.get();
            update.setName(categoryLinkDTO.getName());
            update.setImage(categoryLinkDTO.getImage());
            update.setLink(categoryLinkDTO.getLink());
            update.setDescription(categoryLinkDTO.getDescription());
            categoryLinkRepository.save(update);
        }
        return categoryLinkMapper.toDto(categoryLinkRepository.findByID(categoryLinkDTO.getId()));
    }

    @Override
    public void delete(Long id) {
        categoryLinkRepository.findById(id).ifPresent(categoryLinkRepository::delete);
    }
}
