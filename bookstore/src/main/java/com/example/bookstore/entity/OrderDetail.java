package com.example.bookstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long orderDetailId;

	 @ManyToOne
	 @JoinColumn(name = "order_id")
	 private Order order;

	 @ManyToOne
	 @JoinColumn(name = "book_id")
	 private Book book;

	 private int quantity;
	 private double unitPrice;
}
