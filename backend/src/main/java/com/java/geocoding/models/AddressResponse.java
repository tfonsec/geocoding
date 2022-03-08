package com.java.geocoding.models;

import java.util.List;

import com.google.maps.model.LatLng;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponse {
	
   private Address address;
   private List<LatLng> coordinates;
   private String result;
}
