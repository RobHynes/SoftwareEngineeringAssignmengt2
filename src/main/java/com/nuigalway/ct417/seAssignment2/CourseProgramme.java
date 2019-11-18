package com.nuigalway.ct417.seAssignment2;

import org.joda.time.DateTime;

public class CourseProgramme {
	
	String name;
	String[] modules;
	String[] students;
	DateTime startDate;
	DateTime endDate;
	
	public CourseProgramme(String name, DateTime startDate, DateTime endDate)
	{
		this.name = name;
		this.endDate = endDate;
		this.startDate = startDate;
	}
}
