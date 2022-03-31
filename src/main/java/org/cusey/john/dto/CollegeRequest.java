package org.cusey.john.dto;

public class CollegeRequest {
	
	public String departmentName; 	//1 Engineering = E, Humanities = H (Minimun  and Maximum Length = 1) 
	public String searchStartDate; 	//2 MMDDYYYY
	public String searchEndDate; 	//3 MMDDYYYY
	public String courseNumber; 	//4 Allow Values 0-9 (Minimun  and Maximum Length = 5) 
	public String courseCode;       //5 Allow Values 0-9, A-Z, a-z (Minimun  and Maximum Length = 6) 
	public String StudentId;        //6 UUID
	public Grade passCourse;		//8 

	
	

	
}
