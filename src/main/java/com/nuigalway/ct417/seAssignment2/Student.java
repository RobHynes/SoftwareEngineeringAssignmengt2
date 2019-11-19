package com.nuigalway.ct417.seAssignment2;

import org.joda.time.DateTime;

public class Student {
	
	String name;
	int age;
	DateTime dateOfBirth;
	int id;
	String username;
	CourseProgramme course;
	Module[] modules;
	
	public Student(String name, int age, DateTime DOB, int id, String username, CourseProgramme course, Module[] modArr)
	{	
		this.name = name;
		this.age = age;
		dateOfBirth = DOB;
		this.id = id;
		this.username = username;
		this.course = course;
		modules = modArr;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int num)
	{
		age = num;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setDOB(DateTime date)
	{
		dateOfBirth = date;
	}
	
	public DateTime getDOB()
	{
		return dateOfBirth;
	}
	
	public void setID(int num)
	{
		id = num;
	}
	
	public int getID()
	{
		return id;
	}
	
//	public void setUsername(String n)
//	{
//		name = n;
//	}
	
	public String getUsername()
	{
		username = name + age;
		return username;
	}
	
	public void setCourse(CourseProgramme courseCode)
	{
		course = courseCode;
	}
	
	public CourseProgramme getCourse()
	{
		return course;
	}
	
	public void setModules(Module[] l)
	{
		modules = l;
	}
	
	public Module[] getModules()
	{
		return modules;
	}

}
