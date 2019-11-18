package com.nuigalway.ct417.seAssignment2;

import org.joda.time.DateTime;

public class Student {
	
	String name;
	int age;
	DateTime dateOfBirth;
	int id;
	String username;
	String course;
	String[] modules;
	
	public Student(String name, int age, String DOB, int id, String username, String courseCode, String[] modArr)
	{	
		this.name = name;
		this.age = age;
		dateOfBirth = DOB;
		this.id = id;
		this.username = username;
		course = courseCode;
		modules = modArr;
	}

}
