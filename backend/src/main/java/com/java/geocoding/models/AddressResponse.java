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
	
   private Address address_components;
   private List<LatLng> location;
   private String euclidian_distance;
}
