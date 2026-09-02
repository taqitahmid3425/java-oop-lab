class Calculator {
	// Overloaded method
	int add(int a, int b) {
		return a + b;
	}
	double add(double a, double b) {
		return a + b;
	}
	int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(5, 10));		//15
		System.out.println(c.add(2.5 ,3.5));	//6.0
		System.out.println(c.add(1, 2, 3));		//6
	}
}