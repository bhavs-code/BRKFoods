package com.brkfoods.dto;

import com.brkfoods.model.Restaurant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

private String itemName;
	
	private double itemPrice;
	
	private double itemRating;
	
	private boolean isItemAvailable;
	
	private String itemType;
	
	private String itemCategory;
	
	private Restaurant restaurant;
}
