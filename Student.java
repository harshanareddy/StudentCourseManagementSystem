import java.util.*;

public class Student extends Person implements UserLogin {
    private int studentID;

    private ArrayList<String> enrolledCourses = new ArrayList<>();

    public void enrollInCourse(String coursecode){
        enrolledCourses.add(coursecode);
    }
    public void viewEnrolledCourses(){
        for(String course : enrolledCourses){
            System.out.println(course);
        }
    }

    public void displayDetails(){
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Student ID: " + studentID);
        System.out.println("Enrolled Courses:");
        viewEnrolledCourses();   
    }

    public Student(String name, String email,int studentID){
        super(name, email);
        this.studentID = studentID;
    }

    public void login(String username, String password){
        System.out.println("Student "+ getName() + " logged in successfully");
    }
}
