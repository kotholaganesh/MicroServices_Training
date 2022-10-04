package com.RestWebservices.restfulwebServices.entity;

import java.time.LocalDateTime;

public class Student {
	
	private Long rollNo;
	private String name;
	private LocalDateTime localDate;
	
	public Student() {
		super();
	}
	public Student(Long rollNo, String name, LocalDateTime localDate) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.localDate = localDate;
	}
	public Long getRollNo() {
		return rollNo;
	}
	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDateTime localDate) {
		this.localDate = localDate;
	}
	
	

}
