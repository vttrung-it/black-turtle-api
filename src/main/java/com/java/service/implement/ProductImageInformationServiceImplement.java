package com.java.service.implement;

import com.java.domain.DTO.ProductImageInformationDTO;
import com.java.domain.entity.ProductImageInformation;
import com.java.mapper.ProductImageInformationMapper;
import com.java.repository.ProductImageInformationRepository;
import com.java.service.ProductImageInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductImageInformationServiceImplement implements ProductImageInformationService {

    @Autowired
    private ProductImageInformationRepository productImageInformationRepository;

    private final ProductImageInformationMapper productImageInformationMapper;

    public ProductImageInformationServiceImplement(ProductImageInformationMapper productImageInformationMapper) {
        this.productImageInformationMapper = productImageInformationMapper;
    }

    @Override
    public ProductImageInformationDTO getByCode(String code) {
        return productImageInformationMapper.toDto(productImageInformationRepository.findByCode(code));
    }

    @Override
    public List<ProductImageInformationDTO> getAll() {
        return productImageInformationMapper.toDto(productImageInformationRepository.findAll());
    }

    @Override
    public List<ProductImageInformationDTO> getAllProductByProductCode(String productCode) {
        List<ProductImageInformation> productImageInformationList = productImageInformationRepository.findAllByProductCode(productCode);
        if (productImageInformationList != null && productImageInformationList.size() > 0) {
            return productImageInformationMapper.toDto(productImageInformationList);
        }
        return null;
    }

    @Override
    public List<ProductImageInformationDTO> getAllProductByProductDetailCode(String productDetailCode) {
        List<ProductImageInformation> productImageInformationList = productImageInformationRepository.findAllByProductDetailCode(productDetailCode);
        if (productImageInformationList != null && productImageInformationList.size() > 0) {
            return productImageInformationMapper.toDto(productImageInformationList);
        }
        return null;
    }

    @Override
    public ProductImageInformationDTO create(ProductImageInformationDTO productImageInformationDTO) {
        ProductImageInformation productImageInformation = productImageInformationRepository.save(productImageInformationMapper.toEntity(productImageInformationDTO));
        return productImageInformationMapper.toDto(productImageInformation);
    }

    @Override
    public ProductImageInformationDTO edit(ProductImageInformationDTO productImageInformationDTO) {
        Optional<ProductImageInformation> optional = Optional.ofNullable(productImageInformationRepository.findByCode(productImageInformationDTO.getCode()));
        if (optional.isPresent()) {
            ProductImageInformation productImageInformation = optional.get();
            productImageInformation.setCode(productImageInformationDTO.getCode());
            productImageInformation.setImage(productImageInformationDTO.getImage());
            productImageInformation.setCodeProduct(productImageInformationDTO.getCodeProduct());
            productImageInformation.setCodeProductDetail(productImageInformationDTO.getCodeProductDetail());
            productImageInformationRepository.save(productImageInformation);
        }
        return productImageInformationMapper.toDto(productImageInformationRepository.findByCode(productImageInformationDTO.getCode()));
    }

    @Override
    public void deleteByCode(String code) {
        productImageInformationRepository.deleteByCode(code);
    }
}
