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

	private List<String> address;

	public List<String> getAddress() {
		if(this.address == null){
		      this.address = new ArrayList<>();
		    }
		return address;
	}
	
	

}

	
