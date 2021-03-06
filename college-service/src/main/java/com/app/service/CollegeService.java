package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.College;
import com.app.repository.CollegeRepository;

@Service
public class CollegeService {

	@Autowired
	private CollegeRepository collegeRepository;
	
	public College insertCollegeDataDB(College college) {
		
	  return collegeRepository.save(college);	
		
	}

	public  College getCollegeByCollegeId(Long collegeId) {
		
       return collegeRepository.findByCollegeId(collegeId);
		
	}
	
	

}
