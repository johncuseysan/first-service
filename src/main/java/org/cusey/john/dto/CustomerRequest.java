package org.cusey.john.dto;

public class CustomerRequest {
	
	public String departmentName; 				//1 Engineering = E, Humanities = H (Minimun  and Maximum Length = 1) 
	public String searchStartDate; 				//2 MMDDYYYY
	public String searchEndDate; 				//3 MMDDYYYY
	public String courseNumber; 				//4 Allow Values 0-9 (Minimun  and Maximum Length = 5) 
	public String courseCode;       			//5 Allow Values 0-9, A-Z, a-z (Minimun  and Maximum Length = 6) 
	public String studentId;        			//6 Format UUID
	public String transactionId;				//7 Format UUID
	public Grade passCourse;					//8 (PASS, FAIL)
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getSearchStartDate() {
		return searchStartDate;
	}
	public void setSearchStartDate(String searchStartDate) {
		this.searchStartDate = searchStartDate;
	}
	public String getSearchEndDate() {
		return searchEndDate;
	}
	public void setSearchEndDate(String searchEndDate) {
		this.searchEndDate = searchEndDate;
	}
	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Grade getPassCourse() {
		return passCourse;
	}
	public void setPassCourse(Grade passCourse) {
		this.passCourse = passCourse;
	}
	
	
	@Override
	public String toString() {
		return "CustomerRequest [departmentName=" + departmentName + ", searchStartDate=" + searchStartDate
				+ ", searchEndDate=" + searchEndDate + ", courseNumber=" + courseNumber + ", courseCode=" + courseCode
				+ ", studentId=" + studentId + ", transactionId=" + transactionId + ", passCourse=" + passCourse + "]";
	}
	

	
	
	
}
