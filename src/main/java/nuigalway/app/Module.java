
package nuigalway.app;

import java.util.ArrayList;

public class Module {
    private String id;
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();



    public Module(String id, String name) {

        this.id = id;
        this.name = name;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}