package com.bookstore.bookstoreapi.repository;

import com.bookstore.bookstoreapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
