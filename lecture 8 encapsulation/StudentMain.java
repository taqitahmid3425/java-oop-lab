// Exercise 1 — Student Information
// Create a class Student with private fields name, id, and cgpa.
// Requirements:
// Use private data members.
// Create getter and setter methods.
// CGPA must be between 0.0 and 4.0.
// If an invalid CGPA is provided, display an appropriate message.
// In main(), create a student, set the values, and display them.

class Student {
    private String name;
    private int age;
    private double cgpa;

    public Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        if (cgpa < 4.0 && cgpa > 0.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA. Autometically set to 0");
            this.cgpa = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCgpa(double cgpa) {
        if (cgpa < 4.0 && cgpa > 0.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA. Autometically set to 0");
            this.cgpa = 0;
        }
    }

    public void displayInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("CGPA : " + this.cgpa);
        System.out.println();
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Taqi", 22, 4.00);

        System.out.println("Student Info (set by constructor):");
        s1.displayInfo();

        s1.setName("Tahmid");
        s1.setAge(45);
        s1.setCgpa(3.66);

        System.out.println("Student Info (set by setter function):");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("CGPA: " + s1.getCgpa());
        System.out.println();
    }
}