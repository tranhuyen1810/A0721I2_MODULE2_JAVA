package bai_3_mang_va_phuong_thuc_trong_mang.baitap;

import java.util.Scanner;

public class Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        int[] array = {11, 12, 13, 14, 15, 17, 18, 19};
        int[] newArray = new int[array.length + 1];
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap gia tri ban muon them vao mang: ");
        int num = input.nextInt();
        System.out.print("Nhap vi tri index ban chan chen gia tri num vao: ");
        int index = input.nextInt();
        if (index < 0 || index >= array.length - 1) {
            System.out.print("Khong chen duoc phan tu vao mang.");
        } else {
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = num;
            for (int j = index + 1; j < array.length + 1; j++) {
                newArray[j] = array[j - 1];
            }
            System.out.print("Mang sau khi them phan tu "+num+"  o vi tri index "+index+" la: ");
            for (int i : newArray) {
                System.out.print(i+"\t");
            }
        }
    }
}
