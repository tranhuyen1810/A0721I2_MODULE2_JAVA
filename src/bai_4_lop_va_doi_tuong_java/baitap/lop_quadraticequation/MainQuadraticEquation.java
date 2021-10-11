package bai_4_lop_va_doi_tuong_java.baitap.lop_quadraticequation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        double a;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhap a: ");
            a = input.nextInt();
            if (a == 0) {
                System.out.println("Nhap a khac 0");
            }
        } while (a == 0);
        System.out.print("Nhap b: ");
        double b = input.nextDouble();
        System.out.print("Nhap c: ");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            double r1 = quadraticEquation.getRoot1();
            System.out.println("Nghiem thu nhat la: " + r1);
            double r2 = quadraticEquation.getRoot2();
            System.out.println("Nghiem thu hai la: " + r2);
        } else if (delta == 0) {
            double r = quadraticEquation.getRoot();
            System.out.println("Phuong trinh co 1 nghiem: " + r);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
