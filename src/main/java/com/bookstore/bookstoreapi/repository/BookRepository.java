package com.bookstore.bookstoreapi.repository;

import com.bookstore.bookstoreapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BookRepository extends JpaRepository<Book, Long>{
    Page<Book> findByTitleContainingIgnoreCase(String title, Pageable pageable);

    Page<Book> findByAuthorContainingIgnoreCase(String author, Pageable pageable);

    Page<Book> findByCategoryId(Long categoryId, Pageable pageable);
}
