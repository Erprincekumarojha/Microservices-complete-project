package com.app.dto;

import com.app.model.College;

public class StudentData {
	
	private Long studentId;
	private String name;
	private String email;
	private String address;
	private Long   collegeId;
	
	private College college;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public StudentData(Long studentId, String name, String email, String address, Long collegeId, College college) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.collegeId = collegeId;
		this.college = college;
	}

	public StudentData() {
		super();
	}
	
	

}
