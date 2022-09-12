package com.java.repository;

import com.java.domain.entity.CategoryLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryLinkRepository extends JpaRepository<CategoryLink, Long> {

    @Query(value = "SELECT * FROM category_link WHERE id=?1", nativeQuery = true)
    CategoryLink findByID(Long id);
}
