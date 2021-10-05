package bai_3_mang_va_phuong_thuc_trong_mang.baitap;

import java.util.Scanner;

public class Xoa_phan_tu_trong_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArray = new int[array.length - 1];
        System.out.print("Nhap gia tri can xoa: ");
        int num = input.nextInt();
        int index_del = -1;
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                index_del = i;
                check = true;
            }
        }
        if (check) {
            for (int j = 0; j < index_del; j++) {
                newArray[j] = array[j];
            }
            for (int k = index_del; k < array.length - 1; k++) {
                newArray[k] = array[k + 1];
            }
            for (int i : newArray) {
                System.out.println(i);
            }
        } else {
            System.out.println("Gia tri ban can xoa khong co trong mang. ");
        }
    }
}
