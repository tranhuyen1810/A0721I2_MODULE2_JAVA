package bai_7_abstract_class_va_interface.bai_tap.interface_resizeable_cho_cac_lop_hinh_hoc;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.7);
        shapes[1] = new Rectangle(4.7, 5.7);
        shapes[2] = new Square(6.8);
        double resizePercent = Math.random();
        System.out.println("Diện tích của Circle, Retangle, Square trước khi resize theo thứ tự là: ");
        for (Shape shape : shapes) {
            shape.getArea();
            System.out.println(shape.getArea());
        }
        System.out.println("Tỷ lệ phần trăm tăng kích thước của các hình là: " + resizePercent);
        System.out.println("Diện tích của Circle, Retangle, Square sau khi resize theo thứ tự là: ");
        for (Shape shape : shapes) {
            shape.resize(resizePercent);
            System.out.println(shape.getArea());
        }
    }

}