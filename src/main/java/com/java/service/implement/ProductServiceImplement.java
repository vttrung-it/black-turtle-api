package com.java.service.implement;

import com.java.domain.DTO.ProductDTO;
import com.java.domain.entity.Product;
import com.java.mapper.ProductMapper;
import com.java.repository.ProductRepository;
import com.java.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplement implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    private final ProductMapper productMapper;

    public ProductServiceImplement(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public ProductDTO getByCode(String code) {
        return productMapper.toDto(productRepository.findByCode(code));
    }

    @Override
    public List<ProductDTO> getAll() {
        return productMapper.toDto(productRepository.findAll());
    }

    @Override
    public ProductDTO create(ProductDTO productDTO) {
        Product product = productRepository.save(productMapper.toEntity(productDTO));
        return productMapper.toDto(product);
    }

    @Override
    public ProductDTO edit(ProductDTO productDTO) {
        Optional<Product> optional = Optional.ofNullable(productRepository.findByCode(productDTO.getCode()));
        if (optional.isPresent()) {
            Product product = optional.get();
            product.setCode(productDTO.getCode());
            product.setName(productDTO.getName());
            product.setImage(productDTO.getImage());
            product.setRate(productDTO.getRate());
            product.setDescription(productDTO.getDescription());
            product.setCodeCategoryProduct(productDTO.getCodeCategoryProduct());
            productRepository.save(product);
        }
        return productMapper.toDto(productRepository.findByCode(productDTO.getCode()));
    }

    @Override
    public void deleteByCode(String code) {
        productRepository.deleteProductByCode(code);
    }
}
