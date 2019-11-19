package com.nuigalway.ct417.seAssignment2;

//import org.joda.time.DateTime;

public class Module {
	
	String name;
	int moduleID;
	Student[] students;
	CourseProgramme[] courses;
	
	public Module(String modName, int id, Student[] students, CourseProgramme[] courses)
	{
		name = modName;
		moduleID = id;
		this.students = students;
		this.courses = courses;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setStudents(Student[] l)
	{
		students = l;
	}
	
	public Student[] getStudents()
	{
		return students;
	}
	
	public void setID(int id)
	{
		moduleID = id;
	}
	
	public int getID()
	{
		return moduleID;
	}
	
	public void setCourses(CourseProgramme[] l)
	{
		courses = l;
	}
	
	public CourseProgramme[] getCourses()
	{
		return courses;
	}
}
