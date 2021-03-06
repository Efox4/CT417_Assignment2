package nuigalway.app;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
	
	private String name;
	private ArrayList<Module> modules = new ArrayList<Module>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private DateTime startDate;
	private DateTime endDate;	
	
	
	public Course(String name,  DateTime startDate,	DateTime endDate) {
		
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Module> getModules() {
		return modules;
	}
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	public void addModule(Module module) {
		modules.add(module);
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	public DateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	public DateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	

}
