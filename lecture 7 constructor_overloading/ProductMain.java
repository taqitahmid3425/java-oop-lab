// Exercise 4: Product
// Create a class Product.
// Variables:
// String name;
// double price;
// int quantity;
// Constructor overloading:
// Product(String name)
// Product(String name, double price)
// Product(String name, double price, int quantity)
// Create overloaded calculatePrice() methods:
// double calculatePrice()
// double calculatePrice(int quantity)
// double calculatePrice(int quantity, double discount)
// Rules:
// calculatePrice()= price × object quantity
// calculatePrice(quantity)= price × given quantity
// calculatePrice(quantity, discount)= total price after percentage discount

class Product {
    String name;
    double price;
    int quantity;

    Product(String name) {
        this.name = name;
        System.out.println("product name: " + this.name);
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("product name: " + this.name);
        System.out.println("price: " + this.price);
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        System.out.println("product name: " + this.name);
        System.out.println("price: " + this.price);
        System.out.println("quantity: " + this.quantity);
    }

    double calculatePrice() {
        return price * quantity;
    }

    double calculatePrice(int quantity) {
        return price * quantity;
    }

    double calculatePrice(int quantity, double discount) {
        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }
}

public class ProductMain {
    public static void main(String[] args) {
        System.out.println();
        Product p1 = new Product("Hair Oil");

        System.out.println();
        Product p2 = new Product("Hair Oil", 299);

        System.out.println();
        Product p3 = new Product("Hair Oil", 299, 2);

        System.out.println();
        System.out.println("total price: " + p3.calculatePrice());
        System.out.println("price for 5 items: " + p3.calculatePrice(5));
        System.out.println("price for 5 items with 10% discount: " + p3.calculatePrice(5, 10));
    }
}

