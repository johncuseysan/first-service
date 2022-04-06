package org.cusey.john;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.cusey.john.components.Json;
import org.cusey.john.dto.CustomerRequest;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class TestJSON {
	
	String path = "C:\\Users\\john\\eclipse-workspace\\first-service\\InputFiles";
	
	
	@Test
	void testJSONtoJavaObject()  {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
		try {
			
			Car car = objectMapper.readValue(json, Car.class);
			
			System.out.println(car.toString());
			
			assertNotNull(car);
			
			String color = "Black";
			assertTrue( color.equals(car.getColor() ) );
			
			String type = "BMW";
			assertTrue( type.equals(car.getType() ) );
			
			
		} catch (JsonMappingException e) {
			
			System.out.println(e.getMessage() );
			
		} catch (JsonProcessingException e) {
		
			System.out.println(e.getMessage() );
		}
	    
	}
	
	@Test
	void testJSONFiletoJavaObject()  {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String fileName = "car.json";
		
		try {
			
			Car car = objectMapper.readValue(new File(path + "\\" + fileName), Car.class);
			
			System.out.println(car.toString());
			
			assertNotNull(car);
			
			String color = "Black";
			assertTrue( color.equals(car.getColor() ) );
			
			String type = "BMW";
			assertTrue( type.equals(car.getType() ) );
			
			
		} catch (JsonMappingException e) {
			
			System.out.println(e.getMessage() );
			
		} catch (JsonProcessingException e) {
		
			System.out.println(e.getMessage() );
			
		} catch (IOException  e) {
		
			System.out.println(e.getMessage() );
		}
		
		
	}
	
	@Test
	void testRequest() {
		
		Json json = new Json();
		
		try {
			CustomerRequest request = json.jsonTOObject("REQ001.json", CustomerRequest.class  );
			
			System.out.println(request.toString());
			
			assertNotNull(request);
			
		}catch(StreamReadException e) {
			System.out.println(e.getMessage() );
			
		}catch(DatabindException e) {
			System.out.println(e.getMessage() );
			
		}catch(IOException e) {
			System.out.println(e.getMessage() );
			
		}
	
		
		
		
		
	
	}
	


}
