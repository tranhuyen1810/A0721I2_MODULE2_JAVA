package bai_4_lop_va_doi_tuong_java.thuchanh;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap chieu rong: ");
        double width=input.nextDouble();
        System.out.print("Nhap chieu dai: ");
        double height=input.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("Hinh chu nhat da nhap: "+rectangle.display());
        System.out.println("Chu vi hinh chu nhat la: "+rectangle.getPerimeter());
        System.out.println("Dien tich hinh chu nhat la: "+rectangle.getArea());
    }
}
