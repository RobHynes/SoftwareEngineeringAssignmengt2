package com.nuigalway.ct417.seAssignment2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.joda.time.DateTime;
import org.junit.Test;

public class StudentTest {

	@Test
	public void testSetName()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		
		s1.setName("Callum");
		
		assertEquals("Callum", s1.getName());
		assertNotEquals("Rob", s1.getName());
	}
	
	@Test
	public void testGetName()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		
		assertEquals("Rob", s1.getName());
	}
	
	@Test
	public void testSetAge()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		s1.setAge(25);
		
		assertEquals(25, s1.getAge());
		assertNotEquals(21, s1.getAge());
	}
	
	@Test
	public void testGetAge()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		
		assertEquals("Software Engineering III", s1.getAge());
	}
	
	@Test
	public void testSetDOB()
	{
		Module[] modules = {};
		DateTime dateOfBirth = new DateTime().withDate(1998, 2, 23);
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, dateOfBirth, 54321, "Rob21", course, modules);
		DateTime newDate = new DateTime().withDate(2019, 1, 1);
		s1.setDOB(newDate);
		
		assertEquals(newDate, s1.getDOB());
		assertNotEquals(dateOfBirth, s1.getDOB());
	}
	
	@Test
	public void testGetDOB()
	{
		Module[] modules = {};
		DateTime dateOfBirth = new DateTime().withDate(1998, 2, 23);
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, dateOfBirth, 54321, "Rob21", course, modules);
		
		assertEquals(dateOfBirth, s1.getDOB());
	}
	
	@Test
	public void testSetID()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		s1.setID(52956);
		
		assertEquals(52956, s1.getDOB());
		assertNotEquals(54321, s1.getDOB());
	}
	
	@Test
	public void testGetID()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		
		assertEquals(54321, s1.getDOB());
	}
	
//	@Test
//	public void testSetUsername()
//	{
//		Module[] modules = {};
//		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
//		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
//		s1.setID(52956);
//		
//		assertEquals(52956, s1.getUsername());
//		assertNotEquals(54321, s1.getUsername());
//	}
	
	@Test
	public void testGetUsername()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		s1.setName("Jeremy");
		s1.setAge(55);
		
		assertEquals("Jeremy55", s1.getUsername());
	}
	
	public void testSetCourse()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		CourseProgramme course2 = new CourseProgramme("Computer Science and Information Technology", new DateTime(), new DateTime(), modules);
		s1.setCourse(course2);
		
		assertEquals(course2, s1.getCourse());
		assertNotEquals(course, s1.getCourse());
	}
	
	@Test
	public void testGetCourse()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		
		assertEquals(course, s1.getCourse());
	}
	
	public void testSetModules()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student[] studentArr = {s1};
		CourseProgramme[] courseArr = {course};
		Module module = new Module("Software Engineering III", 4321, studentArr, courseArr);
		Module module1 = new Module("Machine Learning", 6789, studentArr, courseArr);
		Module[] modules2 = {module1};
		s1.setModules(modules2);
		
		assertEquals(module1, s1.getModules()[0]);
		assertNotEquals(module, s1.getModules()[0]);
	}
	
	@Test
	public void testGetModules()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student[] studentArr = {s1};
		CourseProgramme[] courseArr = {course};
		Module module1 = new Module("Machine Learning", 6789, studentArr, courseArr);
		Module[] modules2 = {module1};
		s1.setModules(modules2);
		
		assertEquals(module1, s1.getModules()[0]);
	}
}
