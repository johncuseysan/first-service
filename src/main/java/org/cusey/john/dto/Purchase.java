package org.cusey.john.dto;

public class Purchase {
	
	public Double cost;    						//1 Length 15 Allowed values: 0-9, Format "############.##"
	public String period;						//2 YYYYMM
	public String transactionDate;				//3 YYYYMMDD
	public String startDate;					//4 YYYYMMDD
	public String productType;					//5 Min and max length is 1
	public String productNumber;				//6 Length 9, Allowed values: 0-9
	public String catolog;						//7 Length 2 Allowed values: 0-9, A-Z,
	public String productCode;					//8 Length 5 Allowed values: 0-9, A-Z,
	public String studentId;				    //9  Format UUID
	public String collegeId;					//10 Format UUID
	public CreditCard creditCardType;		    //11 Length  ENUM
	public String forwardTo;				    //12 Length 3 Min and max length are 3.
	public String holdDate;						//13 YYYYMMDD
	public String releaseDate;				    //14 YYYYMMDDHHMM 
	public String collegeName;				    //15 Length 15 Allowed values: 0-9, A-Z,
	public String collegeCatolog;				//16 Length 9  Allowed values: 0-9, A-Z,
	public String collegeNumber;				//17 Length 17 Allowed values: 0-9
	public String collegeType;					//18 Length 1  Private=P, Community=C
	
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public String getCatolog() {
		return catolog;
	}
	public void setCatolog(String catolog) {
		this.catolog = catolog;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}
	public CreditCard getCreditCardType() {
		return creditCardType;
	}
	public void setCreditCardType(CreditCard creditCardType) {
		this.creditCardType = creditCardType;
	}
	public String getForwardTo() {
		return forwardTo;
	}
	public void setForwardTo(String forwardTo) {
		this.forwardTo = forwardTo;
	}
	public String getHoldDate() {
		return holdDate;
	}
	public void setHoldDate(String holdDate) {
		this.holdDate = holdDate;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeCatolog() {
		return collegeCatolog;
	}
	public void setCollegeCatolog(String collegeCatolog) {
		this.collegeCatolog = collegeCatolog;
	}
	public String getCollegeNumber() {
		return collegeNumber;
	}
	public void setCollegeNumber(String collegeNumber) {
		this.collegeNumber = collegeNumber;
	}
	public String getCollegeType() {
		return collegeType;
	}
	public void setCollegeType(String collegeType) {
		this.collegeType = collegeType;
	}
	
	@Override
	public String toString() {
		return "Purchase [cost=" + cost + ", period=" + period + ", transactionDate=" + transactionDate + ", startDate="
				+ startDate + ", productType=" + productType + ", productNumber=" + productNumber + ", catolog="
				+ catolog + ", productCode=" + productCode + ", studentId=" + studentId + ", collegeId=" + collegeId
				+ ", creditCardType=" + creditCardType + ", forwardTo=" + forwardTo + ", holdDate=" + holdDate
				+ ", releaseDate=" + releaseDate + ", collegeName=" + collegeName + ", collegeCatolog=" + collegeCatolog
				+ ", collegeNumber=" + collegeNumber + ", collegeType=" + collegeType + "]";
	}
	

	
	
	
	
	

}
