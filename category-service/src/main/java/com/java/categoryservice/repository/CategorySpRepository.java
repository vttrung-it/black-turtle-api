package com.java.categoryservice.repository;

import com.java.categoryservice.domain.entity.CategorySp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorySpRepository extends JpaRepository<CategorySp, Long> {
}
