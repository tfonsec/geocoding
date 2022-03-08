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

	private List<String> formatted_address;

	public List<String> getFormatted_address() {
		if(this.formatted_address == null) {
			this.formatted_address = new ArrayList<>();
		}
		return formatted_address;
	}
	
	

	//public List<String> getAddress() {
		//if(this.address == null){
		      //this.address = new ArrayList<>();
		    //}
		//return address;
	//}
	
	

}

	
