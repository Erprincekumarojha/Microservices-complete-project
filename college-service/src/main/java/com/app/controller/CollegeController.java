package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.College;
import com.app.service.CollegeService;


@RestController
@RequestMapping("/college")
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	@PostMapping("/")
	public College saveCollegeData(@RequestBody College college) {
		
	  return collegeService.insertCollegeDataDB(college);
	}
	
	
	@GetMapping("/{id}")
	public College getCollegeDataById(@PathVariable("id") Long collegeId) {
	
		return collegeService.getCollegeByCollegeId(collegeId);
	}

}
