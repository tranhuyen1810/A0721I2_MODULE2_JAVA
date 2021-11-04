package bai_15_xu_ly_ngoai_le_va_debug.baitap.su_dung_lop_illegal_triangle_exception;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);//Dùng cái này thì khi ở Triangle phải có message
    }

    public IllegalTriangleException() {
        super("Invalid");
    }
}