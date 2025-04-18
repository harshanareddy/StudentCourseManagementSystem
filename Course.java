public class Course {
    private String courseCode;
    private String courseName;
    private static int totalCourses;
    private Professor instructor;
    private Department department;

    public Course(String courseCode, String courseName, Professor instructor, Department department){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
        this.department = department;
        totalCourses++;
    }

    public void displayCourseDetails(){
        System.out.println("Coursecode: "+courseCode);
        System.out.println("Course Name: "+courseName);
        System.out.println("Instructor: "+ instructor.getName());
        System.out.println("Department: "+department);
        System.out.println("Total Courses: "+totalCourses);

    }

    public static int getTotalCourses(){
        return totalCourses;
    }
}
