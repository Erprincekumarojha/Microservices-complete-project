package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long collegeId;
	private String collegeName;
	private String address;
	private String collegeCode;
	
	
	

	public College() {
		super();
	}


	public Long getCollegeId() {
		return collegeId;
	}


	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCollegeCode() {
		return collegeCode;
	}


	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}


	public College(Long collegeId, String collegeName, String address, String collegeCode) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.address = address;
		this.collegeCode = collegeCode;
	}
	
	

}
