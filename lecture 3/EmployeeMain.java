// Create an Employee class with fields: name, designation, and salary. 
// • Assign values directly in main. 
// • Write a method increaseSalary() to add a given amount to salary. 
// • Display updated salary. 

class Employee {
    String name;
    String designation;
    float salary;

     public void display() {
        System.out.println();
        System.out.println("Employee information:");
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
     }
}

public class EmployeeMain {
    public static void main (String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Taqi Tahmid";
        emp1.designation = "civil engineer";
        emp1.salary = 45000;
        emp1.display();

        Employee emp2 = new Employee();
        emp2.name = "Kazi Rehan";
        emp2.designation = "keyboard artist";
        emp2.salary = 50000;
        emp2.display();

    }
}
