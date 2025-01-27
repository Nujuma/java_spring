package com.in28minutes.school_information.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.school_information.repository.SchoolRepository;

import com.in28minutes.school_information.school.bean.School;

@RestController
public class SchoolController
{

	@Autowired
	private SchoolRepository  schoolRepository;
	
	
@GetMapping("/schools")
public List<School> getAllStudents()
{
	
	
	return schoolRepository.findAll();
			
}
}
