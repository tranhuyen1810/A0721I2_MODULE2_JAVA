package bai_14_thuat_toan_sap_sep.baitap.cai_dat_insert_sort;

public class InsertSort {
    static int[] list={5,7,8,3,7,2,-2,-9,2,9};
    public static void insertionSort(int[] list){
        int size=list.length;
        for(int i=1;i<size;i++){
            int j=i-1;
            int temp=list[i];
            while (j>=0&&temp<list[j]){
                list[j+1]=list[j];
                j--;
            }
            list[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Array after sorting: ");
        insertionSort(list);
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+"\t");
        }
    }
}