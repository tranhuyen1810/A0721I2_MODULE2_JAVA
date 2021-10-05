package bai_3_mang_va_phuong_thuc_trong_mang.thuchanh;

import java.util.Scanner;

public class Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Nhap ten can tim: ");
        String name = input.nextLine();
        boolean isExits = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(name)) {
                System.out.println("Vi tri cua sinh vien " + name + "trog danh sach la: " + (i + 1));
                isExits = true;
                break;
            }
        }
        if (!isExits) {
            System.out.println("Khong co sinh vien " + name + "trong danh sach.");
        }
    }
}
