package nuigalway.app;
import java.util.ArrayList;
import org.joda.time.DateTime;


public class Student
{

    private String name;
    private int age;
    private int id;
    private DateTime dob;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private String username;


    public Student(String name, int age, int id, DateTime dob){
        this.name = name;
        this.age = age;
        this.id = id;
        this.dob = dob;
        this.username = getUsername();
    }




    public String getUsername(){

        String name = getName();
        String age = Integer.toString(getAge());
        String username = name + age;
        return username;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    public DateTime getDOB() {
    	return dob;
    }
    
    
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setDOB(DateTime dob) {
    	this.dob = dob;
    }

}