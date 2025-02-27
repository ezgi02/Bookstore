package com.example.bookstore.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="books")
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long bookId;
	 
	 private String title;
	 private String author;
	 private String publisher;
	 private LocalDate publicationDate;
	 private String isbn;
	 private double price;
	 private int stockQuantity;
	 private String url;

}
