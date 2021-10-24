package bai_5_access_modifier_static.bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

//    private double getRadius(){
//        return this.radius;
//    }
//    private double getArea(){
//        return radius*radius*Math.PI;
//    }

//    double getRadius(){
//        return this.radius;
//    }
//     double getArea(){
//        return radius*radius*Math.PI;
//    }

//    protected double getRadius(){
//        return this.radius;
//    }
//    protected double getArea(){
//        return radius*radius*Math.PI;
//    }
}
