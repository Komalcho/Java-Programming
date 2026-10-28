import java.util.Scanner;
class Person
{
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
class Student extends Person
{
    String course;
    int rollNumber;
    Student(String name, int age, String course, int rollNumber) {
        super(name, age);
        this.course = course;
        this.rollNumber = rollNumber;
    }
    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Roll Number: " + rollNumber);
    }
}
class GraduateStudent extends Student
{
    int graduationYear;
    GraduateStudent(String name, int age, String course, int
            rollNumber, int graduationYear)
    {
        super(name, age, course, rollNumber);
        this.graduationYear = graduationYear;
    }
    void display() {
        System.out.println("\nGraduate Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Graduation Year: " + graduationYear);
    }
}
class Teacher extends Person
{
    String subject;
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    void display() {
        System.out.println("\nTeacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}
class Administrator extends Person
{
    String department;
    Administrator(String name, int age, String department)
    {
        super(name, age);
        this.department = department;
    }
    void display() {
        System.out.println("\nAdministrator Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Student
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        Student s = new Student(name, age, course, rollNumber);
        s.display();
// Graduate Student
        sc.nextLine();
        System.out.print("\nEnter Graduate Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        System.out.print("Enter Graduation Year: ");
        int year = sc.nextInt();
        GraduateStudent g =
                new GraduateStudent(name, age, course, rollNumber, year);
        g.display();
// Teacher
        sc.nextLine();
        System.out.print("\nEnter Teacher Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();
        Teacher t = new Teacher(name, age, subject);
        t.display();
//Administrator
        System.out.print("\nEnter Administrator Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        Administrator a = new Administrator(name, age, department);
        a.display();
        sc.close();
    }
}
