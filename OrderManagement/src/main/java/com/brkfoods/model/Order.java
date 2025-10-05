package com.brkfoods.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	private String orderId;
	
	private String userId;
	
	private String restaurantId;
	
	private List<OrderItem> orderItems;
	
	private String status;
	
	private double orderPrice;
	
	public Order(String userId, String restaurantId, List<OrderItem> orderItems, String status, double orderPrice) {
		super();
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.orderItems = orderItems;
		this.status = status;
		this.orderPrice = orderPrice;
	}


}
