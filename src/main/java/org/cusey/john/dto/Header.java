package org.cusey.john.dto;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;

public class Header {
	
	private static final Logger log = LoggerFactory.getLogger(Header.class);
	
	public String token;					
	public String tokenIP; 					
	
	public int collegeId;					
	public int projectId;					
	
	public String data;						
	public String tokenAuthCode; 	
	
	
	
	public Header() {
		super();
	}

	public void setAll(String token, String tokenIP, int collegeId, int projectId, String data, String tokenAuthCode) {
		this.token = token;
		this.tokenIP = tokenIP;
		this.collegeId = collegeId;
		this.projectId = projectId;
		this.data = data;
		this.tokenAuthCode = tokenAuthCode;
	}
	
	public void assignHeader(HttpHeaders header) {
		
	    for (Map.Entry<String, List<String>> entry : header.entrySet())
	    {
	    	 String key = entry.getKey();
	    	log.info("HEADER KEY: "+ key);
	    	
	    	List<String> value = entry.getValue();  
	    	
	    	if(key.equals("token")) {
	    		this.setToken(value.get(0));
	    	}
	    	if(key.equals("tokenIP")) {
	    		this.setTokenIP(value.get(0));
	    	}
	    	if(key.equals("collegeId")) {
	    		if( value.get(0) instanceof String) {
	    			this.setCollegeId(Integer.parseInt(value.get(0)));
	    		}else {
	    			log.info("College Id in Header Object in Unknown");
	    		}
	    		
	    	}
	    	
	    	if(key.equals("projectId")) {
	    		if( value.get(0) instanceof String) {
	    			this.setProjectId(Integer.parseInt(value.get(0)));
	    		}else {
	    			log.info("Project Id in Header Object in Unknown");
	    		}
	    		
	    	}
	    	if(key.equals("data")) {
	    		this.setData(value.get(0));
	    	}
	    	
	    	if(key.equals("tokenAuthCode")) {
	    		this.setTokenAuthCode(value.get(0));
	    	}
	    	
	        for (int i = 0; i < value.size(); i++) {
	        	 
	            // Print all elements of List
	            System.out.println("HEADER VALUE: " + value.get(i));
	        }
	    	
	    }
	}
	

	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public String getTokenIP() {
		return tokenIP;
	}


	public void setTokenIP(String tokenIP) {
		this.tokenIP = tokenIP;
	}


	public int getCollegeId() {
		return collegeId;
	}


	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}


	public int getProjectId() {
		return projectId;
	}


	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getTokenAuthCode() {
		return tokenAuthCode;
	}


	public void setTokenAuthCode(String tokenAuthCode) {
		this.tokenAuthCode = tokenAuthCode;
	}


	public static Logger getLog() {
		return log;
	}

	@Override
	public String toString() {
		return "Header [token=" + token + ", tokenIP=" + tokenIP + ", collegeId=" + collegeId + ", projectId="
				+ projectId + ", data=" + data + ", tokenAuthCode=" + tokenAuthCode + "]";
	}




}
