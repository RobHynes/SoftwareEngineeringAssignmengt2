package com.nuigalway.ct417.seAssignment2;

import org.joda.time.DateTime;

public class Module {
	
	String name;
	String[] students;
	
	public Module(String modName)
	{
		name = modName;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setStudents(String[] l)
	{
		students = l;
	}
	
	public String[] getStudents()
	{
		return students;
	}
}
