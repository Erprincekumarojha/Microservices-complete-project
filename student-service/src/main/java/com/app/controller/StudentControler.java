package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.StudentData;
import com.app.model.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentControler {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/")
	public Student saveStudentData(@RequestBody Student student) {
		
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/{id}")
	public  StudentData getStudentDetails(@PathVariable("id") Long studentId) {
		
		
	
		return studentService.getStudentData(studentId);
	}
	
}
