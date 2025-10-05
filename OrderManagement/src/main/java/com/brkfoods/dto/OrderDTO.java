package com.brkfoods.dto;

import java.util.List;

import com.brkfoods.model.OrderItem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

private String userId;
	
	private String restaurantId;
	
	private List<OrderItem> orderItems;
	
	private String status;
	
	private double orderPrice;
	
}
