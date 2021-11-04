package bai_11_dsa_stack_queue.baitap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;
import java.util.Stack;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < integerArray.length; i++) {
            stack.push(integerArray[i]);
        }
        System.out.println("Mang ban dau: ");
        for (int i = 0; i < integerArray.length; i++) {
            System.out.printf(integerArray[i] + "\t");
        }
        System.out.println("Mang sau khi dao nguoc: ");
        for (int i = 0; i < integerArray.length; i++) {
            System.out.printf((stack.pop() + "\t"));
        }
    }
}

//public class ReverseIntegerArray {
//    public static void main(String[] args) {
//        Stack<String> wStack = new Stack<>();
//        String word = "today is a beautiful day";
//        String[] mWord = word.split(" ");
//        for (String w : mWord) {
//            wStack.push(w);
//        }
//        System.out.println("Chuoi chua dao nguoc: ");
//        for (int i = 0; i < mWord.length; i++) {
//            System.out.printf(mWord[i] + "\t");
//        }
//
//        for (int i = 0; i < mWord.length; i++) {
//            mWord[i] = wStack.pop();
//        }
//        System.out.println();
//        System.out.println("Chuoi sau khi dao nguoc: ");
//        for (int i = 0; i < mWord.length; i++) {
//            System.out.printf( mWord[i] + "\t");
//        }
//    }
//}

