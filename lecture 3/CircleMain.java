// Create a Circle class with a field: radius. 
// Assign value directly. 
// Write methods to calculate and display the area and circumference

class Circle {
    double radius;

    public void displayArea() {
        double area = 3.1416 * radius * radius;
        System.out.println();
        System.out.println("Area of circle is " + area);
    }
    
    public void displayCircumference() {
        double circumference = 2 * 3.1416 * radius;
        System.out.println();
        System.out.println("Circumference of circle is " + circumference);
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 3;

        c1.displayArea();
        c1.displayCircumference();
    }
}
