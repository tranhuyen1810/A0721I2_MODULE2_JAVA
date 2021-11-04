package bai_11_dsa_stack_queue.baitap.optional_chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Stack;

public class DecimalToBinary {
    public void convertBinary(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num != 0) {
            int remainder = num % 2;
            stack.push(remainder);
            num /= 2;
        }
        while (!(stack.isEmpty())) {
            System.out.println(stack.pop());
        }
    }
}
