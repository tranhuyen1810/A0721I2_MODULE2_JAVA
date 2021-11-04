package bai_11_dsa_stack_queue.baitap.kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
    public boolean checkParenthesis(String str) {
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '(') {
                bStack.push(sym);
            } else if (sym == ')') {
                if (bStack.isEmpty()) {
                    return false;
                } else if (bStack.pop() != '(') {
                    return false;
                }
            }
        }
        if (bStack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap giai thuat can kiem tra: ");
        String string = input.nextLine();
        Parenthesis parenthesis = new Parenthesis();
        System.out.println(parenthesis.checkParenthesis(string));
    }

}