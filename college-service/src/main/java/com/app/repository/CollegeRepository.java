package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.College;

public interface CollegeRepository  extends JpaRepository<College,Long>{

	College findByCollegeId(Long collegeId);

}
