package bai_11_dsa_stack_queue.thuchanh.trien_khai_stack_su_dung_lop_linkedlist_trong_thu_vien_java_util;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    //Cài đặt phương thức push() đẩy 1 phần thử vào đầu ngăn xếp.
    public void push(T element) {
        stack.addFirst(element);
    }

    // Cài đặt phương thức pop() xóa 1 phần tử đầu khỏi ngăn xếp.
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    //Cài đặt phương thức size()
    public int size() {
        return stack.size();
    }

    //Cài đặt phương thức isEmpty() kiểm tra ngăn xếp có rỗng không.
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}