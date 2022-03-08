package com.java.geocoding.models;

import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@NoArgsConstructor
@ToString
public class Address {

	private List<String> addresses;

	public List<String> getAddresses() {
		if(this.addresses == null){
		      this.addresses = new ArrayList<>();
		    }
		return addresses;
	}
	
	

}

	
