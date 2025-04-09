package com.bookstore.bookstoreapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "books")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private String coverImagePath; // NEW ✅
}
