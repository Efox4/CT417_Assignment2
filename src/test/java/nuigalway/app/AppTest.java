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
	public void studentTest() {
			
		String studentName = "bob";
		int studentAge = 34;
		int studentId = 144443;
		DateTime sdob = new DateTime(1981, 2, 26, 12, 0, 0, 0);
		
		
		
		//Module module = new Module( 'CT417','softeng');
		Student student = new Student(studentName, studentAge, studentId, sdob);
		
		assertTrue(student.getName().contentEquals("bob"));
	
	
	
	}
	
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
}