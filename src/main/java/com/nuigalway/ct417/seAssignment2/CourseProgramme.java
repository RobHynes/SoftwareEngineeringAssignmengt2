package com.nuigalway.ct417.seAssignment2;

import org.joda.time.DateTime;

public class CourseProgramme {
	
	String name;
	String[] modules;
	String[] students;
	DateTime startDate;
	DateTime endDate;
	
	public CourseProgramme(String name, DateTime startDate, DateTime endDate, String[] moduleList, String[] studentList)
	{
		this.name = name;
		this.endDate = endDate;
		this.startDate = startDate;
		modules = moduleList;
		students = studentList;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setStartDate(DateTime date)
	{
		startDate = date;
	}
	
	public DateTime getStartDate()
	{
		return startDate;
	}
	
	public void setEndDate(DateTime date)
	{
		endDate = date;
	}
	
	public DateTime getEndDate()
	{
		return endDate;
	}
	
	public void setStudents(String[] l)
	{
		students = l;
	}
	
	public String[] getStudents()
	{
		return students;
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
