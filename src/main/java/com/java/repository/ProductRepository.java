package com.java.repository;

import com.java.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * FROM product WHERE id=?1", nativeQuery = true)
    Product findByID(Long id);
}
