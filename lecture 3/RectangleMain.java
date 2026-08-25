class Rectangle {
    int length;
    int width;

    public void Area() {
        int area = length * width;
        System.out.println("Area is " + area);
    }

    public void Perimeter() {
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter is " + perimeter);
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 12;
        r1.width = 3;
        r1.Area();
        r1.Perimeter();

        Rectangle r2 = new Rectangle();
        r2.length = 2;
        r2.width = 8;
        r2.Area();
        r2.Perimeter();

    }
}
