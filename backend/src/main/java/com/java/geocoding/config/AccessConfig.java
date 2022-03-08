package com.java.geocoding.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AccessConfig {
	
	private String key_code;

	public AccessConfig() {
		
		this.key_code = "AIzaSyC_fpgmaLQZETCePy59I2am58UbFiYay34";
	}

	
}
