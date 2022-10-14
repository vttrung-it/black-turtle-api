package com.java.repository;

import com.java.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * FROM product WHERE code=?1", nativeQuery = true)
    Product findByCode(String code);

    @Modifying
    @Query(value = "DELETE FROM product WHERE product.code=?1", nativeQuery = true)
    void deleteProductByCode(String code);
}
