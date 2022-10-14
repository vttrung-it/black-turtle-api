package com.java.repository;

import com.java.domain.entity.CategoryProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryProductRepository extends JpaRepository<CategoryProduct, Long> {

    @Query(value = "SELECT * FROM category_product WHERE id=?1", nativeQuery = true)
    CategoryProduct findByID(Long id);

    @Query(value = "SELECT * FROM category_product WHERE code=?1", nativeQuery = true)
    CategoryProduct findByCode(String code);

    @Modifying
    @Query(value = "DELETE FROM category_product WHERE category_product.code=?1", nativeQuery = true)
    void deleteCategoryProductByCode(String code);
}
