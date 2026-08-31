class Student {
    int ID;
    String name;
    String email;
    double result;

	Student(int id, String N, String E, double R)
	{
		ID = id;
		name = N;
		email = E;
		result = R;
	}
	
    public void show() {
		System.out.println("Data of the Student:");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("email: " + email);
        System.out.println("Result: " + result);
		System.out.println("-------------------------");
	}
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Taqi Tahmid", "student@email.com", 3.23);
        s1.show();
		
		Student s2 = new Student(2, "Rahim", "rahim@email.com", 3.78);
        s2.show();
		
		Student s3 = new Student(3, "Arafat", "arafat@email.com", 3.56);
        s3.show();
    }
}
