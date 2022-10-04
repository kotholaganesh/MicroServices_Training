package com.RestWebservices.restfulwebServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RestWebservices.restfulwebServices.Service.StudentDAO;
import com.RestWebservices.restfulwebServices.entity.Student;

@RestController
public class WebServiceController {
	
	@Autowired
	private StudentDAO students;
	
	@RequestMapping(method=RequestMethod.GET,path="/hello")
	public String hello()
	{
	 return "Hello world";	
	}
	
	@GetMapping("/students")
	public List<Student> retreiveAll()
	{
		return students.findAll();
		
	}

}
