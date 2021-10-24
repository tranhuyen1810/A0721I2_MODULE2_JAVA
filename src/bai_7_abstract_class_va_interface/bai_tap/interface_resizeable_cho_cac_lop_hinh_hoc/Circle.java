package bai_7_abstract_class_va_interface.bai_tap.interface_resizeable_cho_cac_lop_hinh_hoc;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    @Override
    public void resize(double percent) {
        this.radius = radius + radius * percent;
    }

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

    @Override
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
