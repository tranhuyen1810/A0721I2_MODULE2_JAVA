package bai_3_mang_va_phuong_thuc_trong_mang.thuchanh;

import java.util.Scanner;

public class Tim_gia_tri_lon_nhat_cua_mang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Nhap so luong phan tu cua mang:");
            size=input.nextInt();
            if(size>20){
                System.out.println("Nhap so luong phan tu nho hon 20");
            }
        }while (size>20);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.print("Nhap gia tri cua phan tu thu "+(i+1)+": ");
            array[i]=input.nextInt();
            i++;
        }
        System.out.print("Mang da nhap: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max=array[0];
        int index=0;
        for(int j=0;j<array.length;j++){
            if(array[j]>max){
                max=array[j];
                index=j+1;
            }
        }
        System.out.println("Gia tri lon nhat la: "+max+", o vi tri thu "+index);
    }
}
