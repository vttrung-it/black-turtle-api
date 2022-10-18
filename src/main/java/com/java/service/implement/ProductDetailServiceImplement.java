package com.java.service.implement;

import com.java.domain.DTO.ProductDetailDTO;
import com.java.domain.entity.ProductDetail;
import com.java.mapper.ProductDetailMapper;
import com.java.repository.ProductDetailRepository;
import com.java.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDetailServiceImplement implements ProductDetailService {

    @Autowired
    private ProductDetailRepository productDetailRepository;

    private final ProductDetailMapper productDetailMapper;

    public ProductDetailServiceImplement(ProductDetailMapper productDetailMapper) {
        this.productDetailMapper = productDetailMapper;
    }

    @Override
    public ProductDetailDTO getByCode(String code) {
        return productDetailMapper.toDto(productDetailRepository.findByCode(code));
    }

    @Override
    public List<ProductDetailDTO> getAll() {
        return productDetailMapper.toDto(productDetailRepository.findAll());
    }

    @Override
    public List<ProductDetailDTO> getAllProductDetailByProductCode(String productCode) {
        List<ProductDetail> productDetailList = productDetailRepository.findAllByProductCode(productCode);
        if (productDetailList != null && productDetailList.size() > 0) {
            return productDetailMapper.toDto(productDetailList);
        }
        return null;
    }

    @Override
    public ProductDetailDTO create(ProductDetailDTO productDetailDTO) {
        ProductDetail productDetail = productDetailRepository.save(productDetailMapper.toEntity(productDetailDTO));
        return productDetailMapper.toDto(productDetail);
    }

    @Override
    public ProductDetailDTO edit(ProductDetailDTO productDetailDTO) {
        Optional<ProductDetail> optional = Optional.ofNullable(productDetailRepository.findByCode(productDetailDTO.getCode()));
        if (optional.isPresent()) {
            ProductDetail productDetail = optional.get();
            productDetail.setCode(productDetailDTO.getCode());
            productDetail.setColor(productDetailDTO.getColor());
            productDetail.setPrice(productDetailDTO.getPrice());
            productDetail.setSize(productDetailDTO.getSize());
            productDetail.setDescription(productDetailDTO.getDescription());
            productDetail.setCodeProduct(productDetailDTO.getCodeProduct());
            productDetailRepository.save(productDetail);
        }
        return productDetailMapper.toDto(productDetailRepository.findByCode(productDetailDTO.getCode()));
    }

    @Override
    public void deleteByCode(String code) {
        productDetailRepository.deleteProductDetailByCode(code);
    }
}
