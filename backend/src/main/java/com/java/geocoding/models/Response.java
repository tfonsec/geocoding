package com.java.geocoding.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Response<T> {
	
	private T content;
	
	private List<String> errors;
	
	public List <String> getErrors() {
		if(this.errors == null) {
			this.errors = new ArrayList<>();
		}
		return errors;
	}

}
