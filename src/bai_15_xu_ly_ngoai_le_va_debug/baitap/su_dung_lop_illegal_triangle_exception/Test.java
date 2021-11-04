package bai_15_xu_ly_ngoai_le_va_debug.baitap.su_dung_lop_illegal_triangle_exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter size1: ");
            double size1 = input.nextDouble();
            System.out.println("Enter size2: ");
            double size2 = input.nextDouble();
            System.out.println("Enter size3: ");
            double size3 = input.nextDouble();
            Triangle triangle = new Triangle(size1, size2, size3);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
        System.out.println("End");

    }
}
