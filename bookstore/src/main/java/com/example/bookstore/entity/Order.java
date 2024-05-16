package com.example.bookstore.entity;

import java.time.LocalDate;

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
@Table(name="orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long orderId;

	 @ManyToOne
	 @JoinColumn(name = "user_id")
	 private User user;	

	 private LocalDate orderDate;
	 private double totalAmount;
}
