package com.brkfoods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryAssignmentDTO {
	

	private long orderId;
	
	private String status;

	private long deliveryPerson;

}
