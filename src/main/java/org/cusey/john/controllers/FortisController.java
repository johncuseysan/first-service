package org.cusey.john.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import java.io.IOException;

import org.cusey.john.components.Json;
import org.cusey.john.dto.CustomerRequest;
import org.cusey.john.dto.Header;
import org.cusey.john.dto.StoreResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fortis")
public class FortisController {
	

	@Autowired
	private Header header;
	
	@Autowired
	private CustomerRequest request;
	
	@Autowired
	private StoreResponse response;

	//http://localhost:8081/fortis/api/dean
	@GetMapping("/api/dean")
	public String deanInfo() {
		
		return "John Cusey";
	} 
	
	//http://localhost:8081/fortis/api/student/search
	@RequestMapping(method = RequestMethod.POST, path = "/api/student/search", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StoreResponse> fsigHandle(
    		@RequestBody CustomerRequest request,
    		@RequestHeader(name = "TOKEN", required = false, defaultValue = "9") final String token,
    		@RequestHeader(name = "TOKEN_IP", required = false, defaultValue = "9") final String tokenIP,
    		@RequestHeader(name = "APPLICATION", required = false, defaultValue = "9") final String application,
    		@RequestHeader(name = "COLLEGE_ID", required = false, defaultValue = "9") final int collegeId,
    		@RequestHeader(name = "DATA", required = false, defaultValue = "9") final String data
    		
    ){
		

		this.request = request;
		header.setAll(token, tokenIP, application, collegeId, data);
		
		try {
			response = Json.jsonTOObject(header.getData() +".json", StoreResponse.class  );
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ResponseEntity.ok(response);
	}


}
