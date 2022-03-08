package com.java.geocoding.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import com.java.geocoding.calc.Calculation;
import com.java.geocoding.models.Address;
import com.java.geocoding.models.AddressResponse;

@Service
public class AddressService {

	public AddressResponse getGeolocation(Address request , String key) {
		
		Calculation calc = new Calculation();
		
		List<LatLng> list = new ArrayList<>();
		try {
			
		for(int i = 0; i < request.getFormatted_address().size(); i++) {
				GeoApiContext context = new GeoApiContext.Builder()
						.apiKey(key)
						.build();
				GeocodingResult[] results = GeocodingApi.geocode(context,
						request.getFormatted_address().get(i)).await();
				
				list.add(results[0].geometry.location);
			}
		}catch (IOException e){
            e.printStackTrace();
		}catch (ApiException e){
	           e.getLocalizedMessage();
	        }catch (InterruptedException e){
	            e.printStackTrace();
	        }catch (ArrayIndexOutOfBoundsException e){
	            e.getMessage();
	        }
            
		
			String result = calc.EuclidianCalc(list);
			AddressResponse response = new AddressResponse(request, list, result);
		return response;
		
	}

	}
