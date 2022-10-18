package com.java.repository;

import com.java.domain.entity.ProductImageInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductImageInformationRepository extends JpaRepository<ProductImageInformation, Long> {
    @Query(value = "SELECT * FROM product_image_information WHERE code=?1", nativeQuery = true)
    ProductImageInformation findByCode(String code);

    @Query(value = "SELECT * FROM product_image_information p WHERE p.code_product=?1", nativeQuery = true)
    List<ProductImageInformation> findAllByProductCode(String productCode);

    @Query(value = "SELECT * FROM product_image_information p WHERE p.code_product_detail=?1", nativeQuery = true)
    List<ProductImageInformation> findAllByProductDetailCode(String productDetailCode);

    @Modifying
    @Query(value = "DELETE FROM product_image_information WHERE product.code=?1", nativeQuery = true)
    void deleteByCode(String code);
}
