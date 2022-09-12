package com.java.repository;

import com.java.domain.entity.CategorySp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorySpRepository extends JpaRepository<CategorySp, Long> {

    @Query(value = "SELECT * FROM category_sp WHERE id=?1", nativeQuery = true)
    CategorySp findByID(Long id);
}
