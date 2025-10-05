package com.brkfoods.dto;

import java.util.List;

import com.brkfoods.model.Address;
import com.brkfoods.model.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDTO {

private String restaurantName;
	
	private String phoneNumber;
	
	private Address address;
	
	private List<Item> items;
}
