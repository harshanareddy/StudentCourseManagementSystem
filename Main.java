public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Murthy", "murthy1p@cmich.edu", 201);
        Professor prof2 = new Professor("Dr. Eickholt", "eickholt2j@cmich.edu", 202);

        Course course1 = new Course("CSE101", "Intro to Java", prof1, Department.CSE);
        Course course2 = new Course("ECE201", "Digital Circuits", prof2, Department.ECE);

        Student s1 = new Student("Harshana", "harsh@univ.edu", 1001);
        Student s2 = new Student("Arjun", "arjun@univ.edu", 1002);

        s1.enrollInCourse("CSE101");
        s2.enrollInCourse("ECE201");

        s1.login("harsh", "1234");
        prof1.login("murthy", "5678");

        s1.displayDetails();
        prof1.displayDetails();
        course1.displayCourseDetails();


    }
}
