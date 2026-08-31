// • Create a LibraryMember class with fields: memberName, membershipType, booksBorrowed. 
// • Assign values directly in main. 
// • Write methods borrowBook() and returnBook() to update booksBorrowed. 
// • Display updated status

class LibraryMember {
    String memberName;
    String membershipType;
    int booksBorrowed;

    public void borrowBook() {
        booksBorrowed++;
    }

    public void returnBook() {
        booksBorrowed--;
    }

    public void display() {
        System.out.println();
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership type: " + membershipType);
        System.out.println("Books borrowed: " + booksBorrowed);
    }
}

class LibraryMain {
    public static void main(String[] args) {
        LibraryMember mem1 = new LibraryMember();
        mem1.memberName = "tahmid";
        mem1.membershipType = "student";
        mem1.booksBorrowed = 0;

        mem1.borrowBook();
        mem1.borrowBook();
        mem1.returnBook();
        mem1.display();
    }
}