// • Create a CartItem class with fields: itemName, unitPrice, quantity. 
// • Assign values directly in main. 
// • Write a method to calculate and display the total cost. 

class CartItem {
    String itemName;
    double unitPrice;
    int quantity;

    CartItem(String i, double u, int q) {
        itemName = i;
        unitPrice = u;
        quantity = q;
    }

    public void display() {
        double total = unitPrice * quantity;
        System.out.println();
        System.out.println("Your total price for " + itemName + " will be " + total);
    }
}

public class CartMain {
    public static void main(String[] args) {
        CartItem cart1 = new CartItem("book", 45.06, 3);
        CartItem cart2 = new CartItem("egg", 12, 12);
        CartItem cart3 = new CartItem("rice", 45, 7);

        cart1.display();
        cart2.display();
        cart3.display();
    }
}