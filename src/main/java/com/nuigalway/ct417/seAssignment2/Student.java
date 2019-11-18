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
	
	public Student(String name, int age, DateTime DOB, int id, String username, String courseCode, String[] modArr)
	{	
		this.name = name;
		this.age = age;
		dateOfBirth = DOB;
		this.id = id;
		this.username = username;
		course = courseCode;
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
	
	public void setCourse(String courseCode)
	{
		course = courseCode;
	}
	
	public String getCourse()
	{
		return course;
	}
	
	public void setModules(String[] l)
	{
		modules = l;
	}
	
	public String[] getModules()
	{
		return modules;
	}

}
