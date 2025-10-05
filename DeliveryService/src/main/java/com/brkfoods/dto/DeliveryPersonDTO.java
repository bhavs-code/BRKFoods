package com.brkfoods.dto;

import java.util.List;

import com.brkfoods.model.DeliveryAssignment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryPersonDTO {

private String deliveryPersonName;
	
	private long aadharNumber;
	
	private String email;
	
	private boolean isAvailable;
	
	private List<DeliveryAssignment> deliveryAssignments;
}
