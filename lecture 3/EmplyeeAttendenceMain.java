// • Create an Employee class with fields: name, id, daysPresent, totalWorkingDays. 
// • Add methods: 
// o markAttendance(int days) → increases daysPresent. 
// o attendancePercentage() → returns (daysPresent / totalWorkingDays) * 100. 
// • In main, create two employees, update attendance for a month, and display percentage.

class Employee {
	String name;
	String id;
	int daysPresent;
	int totalWorkingDays;
	
	public void markAttendance(int days)
	{
		daysPresent = days;
	}
	
	public int attendancePercentage()
	{
		return (daysPresent * 100) / totalWorkingDays;
	}
	
	public void display()
	{
		System.out.println();
		System.out.println("Employee name: " + name + " and id: " + id);
		System.out.println("Total working days: " + daysPresent + " , total present days: " + totalWorkingDays);
		int x = attendancePercentage();
		System.out.println("Attendence percentage: " + x + "%");
		System.out.println();
	}
}

class EmplyeeAttendenceMain {
	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		emp1.name = "Taqi";
		emp1.id = "ASH38974";
		emp1.totalWorkingDays = 40;
		emp1.markAttendance(30);
		emp1.display();
	}
}