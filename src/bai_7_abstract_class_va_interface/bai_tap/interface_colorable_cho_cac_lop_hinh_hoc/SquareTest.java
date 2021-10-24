package bai_7_abstract_class_va_interface.bai_tap.interface_colorable_cho_cac_lop_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        square.howToColor();
    }
}