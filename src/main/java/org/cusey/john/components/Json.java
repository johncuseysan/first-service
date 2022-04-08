package org.cusey.john.components;

import java.io.File;

import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class Json {
	


	public static <X> X  jsonTOObject(String resourceName, Class<X> expClass ) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		
		return objectMapper.readValue(new File(Constants.PATH + "\\" + resourceName), expClass);
		
		
		
	}

}
