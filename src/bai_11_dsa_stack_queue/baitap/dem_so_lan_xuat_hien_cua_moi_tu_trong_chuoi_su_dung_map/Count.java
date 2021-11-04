package bai_11_dsa_stack_queue.baitap.dem_so_lan_xuat_hien_cua_moi_tu_trong_chuoi_su_dung_map;

import java.util.Scanner;
import java.util.TreeMap;

public class Count {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = input.nextLine();
        str = str.toUpperCase();
        String[] array = str.split(" ");
        for (String a : array) {
            if (treeMap.containsKey(a)) {
                int value = treeMap.get(a) + 1;
                treeMap.put(a, value);
            } else {
                treeMap.put(a, 1);
            }

        }
        for (String key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));

        }
    }
}