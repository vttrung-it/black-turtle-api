package com.java.repository;

import com.java.domain.entity.CategoryColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryColorRepository extends JpaRepository<CategoryColor, Long> {

    @Query(value = "SELECT * FROM category_color WHERE id=?1", nativeQuery = true)
    CategoryColor findByID(Long id);
}
