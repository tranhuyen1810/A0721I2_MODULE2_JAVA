package bai_1_introduction_to_java.baitap;

import java.util.Scanner;
public class Ung_dung_doc_so_thanh_chu {
    final static String[] ONES = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    final static String[] TENS = {" ", " ", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void readNumber(int num, String value) {
        System.out.print(num > 19 ? TENS[num / 10] + " " + ONES[num % 10] : ONES[num]);
        System.out.print(num > 0 ? value : "");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        readNumber(((num / 100)), "Hundred and");
        readNumber(num % 100, "");
    }

}
