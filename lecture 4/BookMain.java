// Book Information 
// • Create a Book class with fields: title, author, price. 
// • In the main method, create three Book objects and assign values directly. 
// • Display all book details using a method showBook().

class Book {
    String title;
    String author;
    int price;

    Book(String t, String a, int p) {
        title = t;
        author = a;
        price = p;
    }

    public void showBook() {
        System.out.println();
        System.out.println("Book Info:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book("A new world", "Hero Alam", 99);
        Book b2 = new Book("A better tommorow", "Sakib Khan", 129);
        Book b3 = new Book("Somewhere in the past", "Pori Moni", 78);

        b1.showBook();
        b2.showBook();
        b3.showBook();
    }
}