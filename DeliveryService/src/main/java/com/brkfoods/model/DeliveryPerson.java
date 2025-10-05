package com.brkfoods.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "delivery_person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryPerson {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long deliveryPersonId;
	
	private String deliveryPersonName;
	
	private long aadharNumber;
	
	private String email;
	
	private boolean isAvailable;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "deliveryPerson")
	private List<DeliveryAssignment> deliveryAssignments;

	public DeliveryPerson(String deliveryPersonName, long aadharNumber, String email, boolean isAvailable,
			List<DeliveryAssignment> deliveryAssignments) {
		super();
		this.deliveryPersonName = deliveryPersonName;
		this.aadharNumber = aadharNumber;
		this.email = email;
		this.isAvailable = isAvailable;
		this.deliveryAssignments = deliveryAssignments;
	}
	
}
