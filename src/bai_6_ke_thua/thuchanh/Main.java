package bai_6_ke_thua.thuchanh;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        Shape rectangle = new Rectangle();
        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

        Shape square = new Square();
        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
