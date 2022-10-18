package com.java.repository;

import com.java.domain.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
    @Query(value = "SELECT * FROM product_detail WHERE code=?1", nativeQuery = true)
    ProductDetail findByCode(String code);

    @Query(value = "SELECT * FROM product_detail p WHERE p.code_product=?1", nativeQuery = true)
    List<ProductDetail> findAllByProductCode(String codeProduct);

    @Modifying
    @Query(value = "DELETE FROM product_detail WHERE product_detail.code=?1", nativeQuery = true)
    void deleteProductDetailByCode(String code);
}
