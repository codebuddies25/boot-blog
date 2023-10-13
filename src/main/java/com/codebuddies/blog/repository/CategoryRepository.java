package com.codebuddies.blog.repository;

import com.codebuddies.blog.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
