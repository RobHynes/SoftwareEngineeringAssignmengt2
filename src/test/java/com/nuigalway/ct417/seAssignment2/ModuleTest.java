package com.nuigalway.ct417.seAssignment2;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;

public class ModuleTest {
	
	@Test
	public void testSetName()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student s2 = new Student("Callum", 21, new DateTime(), 12345, "Callum21", course, modules);
		Student[] studentArr = {s1,s2};
		CourseProgramme[] courseArr = {};
		Module module = new Module("Software Engineering III", 1234, studentArr, courseArr);
		module.setName("Machine Learning");
		
		assertEquals("Machine Learning", module.getName());
		assertNotEquals("Software Engineering III", module.getName());
	}
	
	@Test
	public void testGetName()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student s2 = new Student("Callum", 21, new DateTime(), 12345, "Callum21", course, modules);
		Student[] studentArr = {s1,s2};
		CourseProgramme[] courseArr = {};
		Module module = new Module("Software Engineering III", 4321, studentArr, courseArr);
		
		assertEquals("Software Engineering III", module.getName());
	}
	
	@Test
	public void testSetStudents()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student s2 = new Student("Callum", 21, new DateTime(), 12345, "Callum21", course, modules);
		Student[] studentArr = {s1,s2};
		CourseProgramme[] courseArr = {};
		Module module = new Module("Software Engineering III", 1234, studentArr, courseArr);
		
		Student s3 = new Student("Hao", 21, new DateTime(), 78911, "Hao21", course, modules);
		Student s4 = new Student("Patrice", 21, new DateTime(), 66666, "Patrice21", course, modules);
		
		Student[] studentArr2 = {s3, s4};
		module.setStudents(studentArr2);
		
		assertEquals(s3, module.getStudents()[0]);
		assertEquals(s4, module.getStudents()[1]);
		assertNotEquals(s1, module.getStudents()[0]);
		assertNotEquals(s2, module.getStudents()[1]);
	}
	
	@Test
	public void testGetStudents()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student s2 = new Student("Callum", 21, new DateTime(), 12345, "Callum21", course, modules);
		Student[] studentArr = {s1,s2};
		CourseProgramme[] courseArr = {};
		Module module = new Module("Software Engineering III", 1234, studentArr, courseArr);

		assertEquals(s1, module.getStudents()[0]);
		assertEquals(s2, module.getStudents()[1]);
	}
	
	@Test
	public void testSetID()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student s2 = new Student("Callum", 21, new DateTime(), 12345, "Callum21", course, modules);
		Student[] studentArr = {s1,s2};
		CourseProgramme[] courseArr = {};
		Module module = new Module("Software Engineering III", 1234, studentArr, courseArr);
		module.setID(5678);
		
		assertEquals(5678, module.getID());
		assertNotEquals(1234, module.getID());
	}
	
	@Test
	public void testGetID()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student s2 = new Student("Callum", 21, new DateTime(), 12345, "Callum21", course, modules);
		Student[] studentArr = {s1,s2};
		CourseProgramme[] courseArr = {};
		Module module = new Module("Software Engineering III", 1234, studentArr, courseArr);
		
		assertEquals(1234, module.getID());
	}
	
	@Test
	public void testSetCourses()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student s2 = new Student("Callum", 21, new DateTime(), 12345, "Callum21", course, modules);
		Student[] studentArr = {s1,s2};
		CourseProgramme course2 = new CourseProgramme("Computer Science and Information Technology", new DateTime(), new DateTime(), modules);		
		CourseProgramme[] courseArr = {course, course2};
		Module module = new Module("Software Engineering III", 1234, studentArr, courseArr);
		CourseProgramme course3 = new CourseProgramme("Mechanical Engineering", new DateTime(), new DateTime(), modules);		
		CourseProgramme course4 = new CourseProgramme("Civil Engineering", new DateTime(), new DateTime(), modules);		
		CourseProgramme[] courseArr2 = {course3, course4};
		module.setCourses(courseArr2);
		
		assertEquals(course3, module.getCourses()[0]);
		assertEquals(course4, module.getCourses()[1]);
		assertNotEquals(course, module.getCourses()[0]);
		assertNotEquals(course2, module.getCourses()[1]);
	}
	
	@Test
	public void testGetCourses()
	{
		Module[] modules = {};
		CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", new DateTime(), new DateTime(), modules);
		Student s1 = new Student("Rob", 21, new DateTime(), 54321, "Rob21", course, modules);
		Student s2 = new Student("Callum", 21, new DateTime(), 12345, "Callum21", course, modules);
		Student[] students = {s1,s2};
		CourseProgramme course2 = new CourseProgramme("Computer Science and Information Technology", new DateTime(), new DateTime(), modules);		
		CourseProgramme[] courses = {course, course2};
		Module module = new Module("Software Engineering III", 1234, students, courses);
		
		assertEquals(course, module.getCourses()[0]);
		assertEquals(course2, module.getCourses()[1]);
	}
}
