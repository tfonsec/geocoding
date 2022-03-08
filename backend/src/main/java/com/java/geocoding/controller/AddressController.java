package com.java.geocoding.controller;

import java.util.Date;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.geocoding.config.AccessConfig;
import com.java.geocoding.models.Address;
import com.java.geocoding.models.AddressResponse;
import com.java.geocoding.models.Response;
import com.java.geocoding.service.AddressService;

@Validated
@RestController
@RequestMapping("/geocoding")
public class AddressController {
	
	public static final Logger logger = LoggerFactory.getLogger(AddressController.class);
	
	@Autowired
	AddressService service;
	
	@PostMapping(value = "/location" , 
			produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<AddressResponse>> resourceSearch(@RequestBody @Valid Address address) {
		
		AddressResponse response =  new AddressResponse();
		Date date = new Date();
		AccessConfig access = new AccessConfig();
		Response<AddressResponse> addressResponse = new Response<>();
		
		try {
			response = service.getGeolocation(address, access.getKey_code());
			
		}catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        	
        	logger.info("####### GEOLOCATION RESOURCES RESUME ##########");
            logger.info("INIT: " + date.toString());
            logger.info("REQUEST: " + address.toString());
            logger.info("RESPONSE: " + response.toString());
            logger.info("END: " + new Date());
            logger.info("####### END GEOLOCATION RESOURCES RESUME ##########");
        	
        	
        }
		
		
		addressResponse.setContent(response);
		return  ResponseEntity.ok(addressResponse);
	}

}
