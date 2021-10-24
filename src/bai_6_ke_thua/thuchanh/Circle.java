package bai_6_ke_thua.thuchanh;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    //Cai method 10, 11 de lam gi, vi co method 14,15,16 roi
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of  "
                + super.toString() + " Area = "
                + getArea()
                + " Perimeter =  "
                + getPerimeter();
    }
}
