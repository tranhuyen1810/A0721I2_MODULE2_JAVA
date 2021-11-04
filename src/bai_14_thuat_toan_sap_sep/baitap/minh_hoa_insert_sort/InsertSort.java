package bai_14_thuat_toan_sap_sep.baitap.minh_hoa_insert_sort;

public class InsertSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = array[i];
            //Di chuyển các phần tử của array có giá tri lớn hơn temp về sau 1 vị trí so với vị trí ban đầu
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
    //In các phần tử của mảng
    public static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + "\t");
    }


}
