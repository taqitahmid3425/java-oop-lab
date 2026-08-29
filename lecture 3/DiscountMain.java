// public Create a Product class with fields: name, price, discountPercentage. 
// • Assign values directly in main. 
// • Write a method calculateDiscountedPrice() to print the price after discount. {}

class Product {
    String name;
    double price;
    int discountPercentage;

    public void calculateDiscountedPrice() {
        double discountPrice = price - price * discountPercentage * 0.01;
        System.out.println();
        System.out.println("Price after discount applied: " + discountPrice);
    }
}

public class DiscountMain {
    public static void main(String[] args) {
        Product pro1 = new Product();
        pro1.name = "Hair Creame";
        pro1.price = 999;
        pro1.discountPercentage = 18;

        pro1.calculateDiscountedPrice();
    }
}