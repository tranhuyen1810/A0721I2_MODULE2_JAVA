package bai_14_thuat_toan_sap_sep.baitap.minh_hoa_insert_sort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = input.nextInt();
        int[] sortArray = new int[size];
        System.out.println("Enter value of the array");
        for (int i = 0; i < sortArray.length; i++) {
            sortArray[i] = input.nextInt();
        }
        System.out.println("Your input list: ");
        InsertSort.printArray(sortArray);

        System.out.println();

        System.out.println("Array after sorting");
        InsertSort.insertionSort(sortArray);
        InsertSort.printArray(sortArray);


    }
}