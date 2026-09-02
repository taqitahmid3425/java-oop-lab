class Car {
	String brand;
	int year;
	
	Car(String b, int y)
	{
		brand = b;
		year = y;
	}
	
	public void display()
	{
		System.out.println();
		System.out.println("Car Information:");
		System.out.println("Brand: " + brand);
		System.out.println("Year: " + year);
	}
}

class CarMain {
	public static void main(String[] args)
	{
		Car car1 = new Car("toyota", 2022);
		car1.display();
	}
}