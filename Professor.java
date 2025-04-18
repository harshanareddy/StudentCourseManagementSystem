import java.util.ArrayList;

public class Professor extends Person implements UserLogin{
    private int professorID;
    private ArrayList<String> teachingCourses = new ArrayList<>();

    public Professor(String name, String email, int professorID){
        super(name, email);
        this.professorID = professorID;
    }

    public void assignCourse(String courseName){
        teachingCourses.add(courseName);
    }

    public void viewTeachingCourses(){
        for(String course : teachingCourses){
            System.out.println(course);
        }
    }

    public void displayDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Email: "+getEmail());
        System.out.println("Professor ID: "+professorID);
        System.out.println("Courses assigned: ");
        viewTeachingCourses();
    }

    public void login(String username, String password){
        System.out.println("Professor "+ getName() + " logged in successfully");
    }
    
    
}
