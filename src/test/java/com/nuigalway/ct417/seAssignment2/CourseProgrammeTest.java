package com.nuigalway.ct417.seAssignment2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.joda.time.DateTime;
import org.junit.Test;

public class CourseProgrammeTest {
	
	@Test
	public void testSetName()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		course.setName("Computer Science");
		
		assertEquals("Computer Science", course.getName());
		assertNotEquals("Electronic and Computer Engineering", course.getName());
	}
	
	@Test
	public void testGetName()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);		
		assertEquals("Electronic and Computer Engineering", course.getName());
	}
	
	@Test
	public void testSetStartDate()
	{
		Module[] modules = {};
		DateTime startDate = new DateTime();
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", startDate, new DateTime(), modules);
		course.setName("Computer Science");
		
		DateTime newDate = new DateTime().withDate(2019, 1, 1);
		course.setStartDate(newDate);
		
		assertEquals(newDate, course.getStartDate());
		assertNotEquals(startDate, course.getStartDate());
	}
	
	@Test
	public void testGetStartDate()
	{
		Module[] modules = {};
		DateTime startDate = new DateTime();
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", startDate, new DateTime(), modules);		
		assertEquals(startDate, course.getStartDate());
	}
	
	@Test
	public void testSetEndDate()
	{
		Module[] modules = {};
		DateTime endDate = new DateTime();
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), endDate, modules);
		course.setName("Computer Science");
		
		DateTime newDate = new DateTime().withDate(2019, 1, 1);
		course.setEndDate(newDate);
		
		assertEquals(newDate, course.getEndDate());
		assertNotEquals(endDate, course.getEndDate());
	}
	
	@Test
	public void testGetEndDate()
	{
		Module[] modules = {};
		DateTime endDate = new DateTime();
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), endDate, modules);		
		assertEquals(endDate, course.getEndDate());
	}
	
	@Test
	public void testSetStudents()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student s2 = new Student("Callum", 21, new DateTime(), 12345, "Callum21", course, modules);
		Student[] studentArr = {s1,s2};
		course.setStudents(studentArr);
		
		Student s3 = new Student("Hao", 21, new DateTime(), 78911, "Hao21", course, modules);
		Student s4 = new Student("Patrice", 21, new DateTime(), 66666, "Patrice21", course, modules);
		
		Student[] studentArr2 = {s3, s4};
		course.setStudents(studentArr2);
		
		assertEquals(s3, course.getStudents()[0]);
		assertEquals(s4, course.getStudents()[1]);
		assertNotEquals(s1, course.getStudents()[0]);
		assertNotEquals(s2, course.getStudents()[1]);
	}
	
	@Test
	public void testGetStudents()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student s2 = new Student("Callum", 21, new DateTime(), 12345, "Callum21", course, modules);
		Student[] studentArr = {s1,s2};
		course.setStudents(studentArr);
		
		assertEquals(s1, course.getStudents()[0]);
		assertEquals(s2, course.getStudents()[1]);
	}
	
	@Test
	public void testSetModules()
	{
		Student[] s = {};
		CourseProgramme[] c = {};
		Module module = new Module("Software Engineering III", 1234, s, c);
		Module[] modules = {module};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student s2 = new Student("Callum", 21, new DateTime(), 12345, "Callum21", course, modules);
		Student[] studentArr = {s1,s2};
		course.setStudents(studentArr);
		Module module1 = new Module("Machine Learning", 4321, studentArr, c);
		Module[] modules1 = {module1};
		course.setModules(modules1);
		
		assertEquals(module1, course.getModules()[0]);
		assertNotEquals(module, course.getModules()[0]);
	}
	
	@Test
	public void testGetModules()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student s2 = new Student("Callum", 21, new DateTime(), 12345, "Callum21", course, modules);
		Student[] students = {s1,s2};
		
		CourseProgramme[] courses = {};
		Module module = new Module("Software Engineering III", 1234, students, courses);
		Module[] modules1 = {module};
		course.setModules(modules1);
		
		assertEquals(module, course.getModules()[0]);
	}
	
}
