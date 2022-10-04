package com.RestWebservices.restfulwebServices.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.RestWebservices.restfulwebServices.entity.Student;

@Component
public class StudentDAO {

	private static List<Student> students = new ArrayList<Student>();
	private static Long count=100L;
	
	static
	{
		students.add(new Student(++count,"Ganesh",LocalDateTime.now().minusYears(25)));
		students.add(new Student(++count,"Krishna",LocalDateTime.now().minusYears(24)));
		students.add(new Student(++count,"Murali",LocalDateTime.now().minusYears(23)));
		students.add(new Student(++count,"Sanjay",LocalDateTime.now().minusYears(22)));

	}
	
	public List<Student> findAll()
	{
		return students;
	}
	
}
