// • Create a CartItem class with fields: itemName, unitPrice, quantity. 
// • Assign values directly in main. 
// • Write a method to calculate and display the total cost. 


class CartItem {
    String itemName;
    double unitPrice;
    int quantity;

    public void display() {
        double total = unitPrice * quantity;
        System.out.println();
        System.out.println("Your total price will be " + total);
    }
}

public class CartMain {
    public static void main (String[] args) {
        CartItem cart = new CartItem();
        cart.itemName = "Book";
        cart.unitPrice = 45.06;
        cart.quantity = 3;

        cart.display();
    }
}