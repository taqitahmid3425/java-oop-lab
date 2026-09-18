class Calculator2 {
	// Overloaded constractor
	int a, b, c;
	
	Calculator2(int a, int b) {
		this.a = a;
		this.b = b;
		int d = a + b;
		System.out.println(d);
	}
	Calculator2(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		int e = a + b + c;
		System.out.println(e);
	}
	
	public void add() {
		int d = a + b;
		System.out.println(d);
		int e = a + b + c;
		System.out.println(e);
	}
}

public class Calculator2Main {
	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2(5, 10);
		Calculator2 c2 = new Calculator2(1, 2, 3);
	}
}