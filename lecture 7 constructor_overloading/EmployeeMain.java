// Exercise 1: Employee Salary
// Create a class Employee.
// Variables:
// String name;
// double salary;
// double bonus;
// Constructor overloading:
// Employee(String name)
// Employee(String name, double salary)
// Employee(String name, double salary, double bonus)
// Method overloading:
// double calculateSalary()
// double calculateSalary(double overtime)
// double calculateSalary(double overtime, double allowance)
// Rules:
// calculateSalary()= salary + bonus
// calculateSalary(overtime)= salary + bonus + overtime
// calculateSalary(overtime, allowance)= salary + bonus + overtime + allowance

class Employee {
    String name;
    double salary;
    double bonus;

    Employee(String name) {
        this.name = name;
        System.out.println("name: " + this.name);
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("name: " + this.name);
        System.out.println("salary: " + this.salary);
    }
    
    Employee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
        System.out.println("name: " + this.name);
        System.out.println("salary: " + this.salary);
        System.out.println("bonus: " + this.bonus);
    }

    double calculateSalary() {
        return salary + bonus;
    }

    double calculateSalary(double overtime) {
        return salary + bonus + overtime;
    }

    double calculateSalary(double overtime, double allowance) {
        return salary + bonus + overtime + allowance;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("employee 1");
        Employee emp1 = new Employee("rahim");

        System.out.println();
        System.out.println("employee 2");
        Employee emp2 = new Employee("rahim", 56000);
        
        System.out.println();
        System.out.println("employee 3");
        Employee emp3 = new Employee("rahim", 56000, 1000);
        
        System.out.println();
        System.out.println("employee 3 salary: " + emp3.calculateSalary());
        System.out.println("employee 3 salary with overtime: " + emp3.calculateSalary(2000));
        System.out.println("employee 3 salary with overtime and allowence" + emp3.calculateSalary(1000, 500));
    }
}
