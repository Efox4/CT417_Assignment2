package nuigalway.app;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.junit.Test;

/**
 * Unit tests
 */
public class AppTest 
{
	
	@Test
	public void studentTestName() {
			
		String studentName = "bob";
		int studentAge = 34;
		int studentId = 144443;
		DateTime sdob = new DateTime(1981, 2, 26, 12, 0, 0, 0);
		
		
		Student student = new Student(studentName, studentAge, studentId, sdob);
		
		assertTrue(student.getName().contentEquals("bob"));	
	
	}
	
	@Test
	public void studentTestUserName() {
			
		String studentName = "bob";
		int studentAge = 34;
		int studentId = 144443;
		DateTime sdob = new DateTime(1981, 2, 26, 12, 0, 0, 0);		
		
		Student student = new Student(studentName, studentAge, studentId, sdob);
		
		assertTrue(student.getUsername().contentEquals("bob34"));
	}
	@Test
	public void ModuleTest() {
		
		String studentName = "bob";
		int studentAge = 34;
		int studentId = 144443;
		DateTime sdob = new DateTime(1981, 2, 26, 12, 0, 0, 0);	
		
		
		Student student = new Student(studentName, studentAge, studentId, sdob);
		Module module = new Module( "CT417","softeng");
		module.addStudent(student);
		
		
		assertTrue(module.getStudents().get(0).getId() == (14443));
	}
	@Test
	public void CourseTest() {
		
		String studentName = "bob";
		int studentAge = 34;
		int studentId = 144443;
		DateTime sdob = new DateTime(1981, 2, 26, 12, 0, 0, 0);		
		
		Student student = new Student(studentName, studentAge, studentId, sdob);
		Module module = new Module( "CT417","softeng");
		module.addStudent(student);
		
		DateTime start = new DateTime(2020, 9, 1, 12,0,0,0);
		DateTime end = new DateTime(2021, 9, 1, 12,0,0,0);
		Course course = new Course("CS and IT", start, end);
		course.addModule(module);		
		
		assertTrue(course.getModules().get(0).getStudents().get(0).getId() == (144443));
	}
    
}