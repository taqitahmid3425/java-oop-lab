// Book Information 
// • Create a Book class with fields: title, author, price. 
// • In the main method, create three Book objects and assign values directly. 
// • Display all book details using a method showBook().

class Book {
	String title;
	String author;
	int price;
	
	public void showBook() {
		System.out.println();
		System.out.println("Book Info:");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
}

public class BookMain {
	public static void main (String[] args) {
		Book b1 = new Book();
		b1.title = "A new world";
		b1.author = "Hero Alam";
		b1.price = 99;
		
		Book b2 = new Book();
		b2.title = "A better tommorow";
		b2.author = "Sakib Khan";
		b2.price = 129;
	
		Book b3 = new Book();
		b3.title = "Somewhere in the past";
		b3.author = "Pori Moni";
		b3.price = 78;
		
		b1.showBook();
		b2.showBook();
		b3.showBook();
	}
}