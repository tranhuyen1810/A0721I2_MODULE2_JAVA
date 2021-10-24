package bai_6_ke_thua.baitap;

public class TestMainCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(4.7, "yellow");
        System.out.println(circle);

        Circle cylinder = new Cylinder();
        cylinder = new Cylinder(4.7, 2.3, "blue");
        System.out.println(cylinder);

    }
}
