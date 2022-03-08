package com.java.geocoding.calc;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.google.maps.model.LatLng;

public class Calculation {
	
	public String EuclidianCalc(List<LatLng> string) {
		DecimalFormat decimal = new DecimalFormat("0.00");
		decimal.setRoundingMode(RoundingMode.HALF_UP);
		double sum = 0;
		try {
			List<LatLng> coords = new ArrayList<>(string);
			for(LatLng coorD: coords ) {
				sum = (coords.size() !=1) ? sum + Math.pow((coorD.lat - coorD.lng), 2) : 0;
			}
		
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		double result = Math.sqrt(sum);
		 return decimal.format(result);
	}

}
