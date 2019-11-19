package com.nuigalway.ct417.seAssignment2;

import org.joda.time.DateTime;

public class CourseProgramme {
	
	String name;
	Module[] modules;
	Student[] students;
	DateTime startDate;
	DateTime endDate;
	
	public CourseProgramme(String name, DateTime startDate, DateTime endDate, Module[] moduleList)
	{
		this.name = name;
		this.endDate = endDate;
		this.startDate = startDate;
		modules = moduleList;
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
	
	public void setStudents(Student[] l)
	{
		students = l;
	}
	
	public Student[] getStudents()
	{
		return students;
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
