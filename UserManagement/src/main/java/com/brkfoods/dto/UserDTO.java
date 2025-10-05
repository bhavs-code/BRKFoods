package com.brkfoods.dto;

import java.util.List;

import com.brkfoods.model.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
private String userName;
	
	private String phoneNumber;
	
	private List<Address> userAddresses;
	
	private String email;
	
	private String password;

}
