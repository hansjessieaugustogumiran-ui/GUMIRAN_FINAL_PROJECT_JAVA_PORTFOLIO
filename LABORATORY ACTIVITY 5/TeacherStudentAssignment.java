import java.util.ArrayList;
import java.util.List;

class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, int age, String gender, String studentId) {
        super(name, age, gender);
        this.studentId = studentId;
    }

    public void displayStudent() {
        System.out.println("\n--- Student Information ---");
        displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}


class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public void displayCourse() {
        System.out.println("Course Code: " + courseCode + ", Course Name: " + courseName);
    }
}


class Teacher extends Person {
    private String department;
    private List<Course> courses;

    public Teacher(String name, int age, String gender, String department) {
        super(name, age, gender);
        this.department = department;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayTeacher() {
        System.out.println("\n--- Teacher Information ---");
        displayInfo();
        System.out.println("Department: " + department);

        System.out.println("Courses Handled:");
        for (Course c : courses) {
            c.displayCourse();
        }
    }
}

public class TeacherStudentAssignment {
    public static void main(String[] args) {
        
        Student student = new Student("Alice Garcia", 20, "Female", "S2025-001");


        Course javaCourse = new Course("CS101", "Introduction to Java");
        Course dbCourse = new Course("CS102", "Database Systems");

        Teacher teacher = new Teacher("Mr. Santos", 45, "Male", "Computer Science Department");
        teacher.addCourse(javaCourse);
        teacher.addCourse(dbCourse);

        student.displayStudent();
        teacher.displayTeacher();
    }
}

// GUMIRAN, HANS JESSIE AUGUSTO M.
// BSCS - 2D
// AI USED: CHATGPT-5
// CHAT LINK CONVERSATION: https://chatgpt.com/share/68ff6def-9dfc-8010-aaf7-5edd6e793063
