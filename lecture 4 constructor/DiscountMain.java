// public Create a Product class with fields: name, price, discountPercentage. 
// • Assign values directly in main. 
// • Write a method calculateDiscountedPrice() to print the price after discount. {}

class Product {
    String name;
    double price;
    int discountPercentage;

    Product(String n, double p, int d) {
        name = n;
        price = p;
        discountPercentage = d;
    }

    public void calculateDiscountedPrice() {
        double discountPrice = price - price * discountPercentage * 0.01;
        System.out.println();
        System.out.println("Price for " + name + " after discount applied: " + discountPrice);
    }
}

public class DiscountMain {
    public static void main(String[] args) {
        Product pro1 = new Product("Hair Cream", 999, 18);
        pro1.calculateDiscountedPrice();

        Product pro2 = new Product("body oil", 399, 20);
        pro2.calculateDiscountedPrice();
    }
}