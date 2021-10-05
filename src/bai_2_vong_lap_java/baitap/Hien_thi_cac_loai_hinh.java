package bai_2_vong_lap_java.baitap;

import java.util.Scanner;

public class Hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("1: Print the rectangle");
        System.out.println("2: Print the square triangle");
        System.out.println("3: Print isosceles triangle");
        System.out.println("4: Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter a length: ");
                int length = input.nextInt();
                System.out.println("Enter a width: ");
                int width = input.nextInt();
                for (int i = 1; i <= length; i++) {
                    for (int j = 1; j <= width; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Enter a hight: ");
                int hight = input.nextInt();
                for (int i = 1; i <= hight; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("---------------------");

                for (int i = hight; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("---------------------");

                for (int i = 0; i < hight; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = i; k < hight; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("---------------------");

                for (int i = hight; i >= 1; i--) {
                    for (int j = 1; j <= hight; j++) {
                        if (j < i) {
                            System.out.print("  ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Enter a hight: ");
                int h = input.nextInt();
                int m = h;
                int n = h;
                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= 2 * h - 1; j++) {
                        if (j >= m && j <= n) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    m--;
                    n++;
                    System.out.println();
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
