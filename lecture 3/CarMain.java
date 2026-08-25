class Car {
    String brand;
    String model;
    int year;

    public void displayInfo() {
        System.out.println();
        System.out.println("Car information: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class CarMain {
    public static void main (String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "HAXAS-364";
        c1.year = 2020;
        c1.displayInfo();

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.model = "HADAS-376";
        c2.year = 2017;
        c2.displayInfo();

    }
}
