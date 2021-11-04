package bai_15_xu_ly_ngoai_le_va_debug.baitap.su_dung_lop_illegal_triangle_exception;

public class Triangle {
    private double size1;
    private double size2;
    private double size3;

    public Triangle(double size1, double size2, double size3) throws IllegalTriangleException {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
        if (size1 <= 0 || size2 <= 0 || size3 <= 0 || size1 + size2 < size3 || size2 + size3 < size1 || size1 + size3 < size2) {
            throw new IllegalTriangleException();
//            throw new IllegalTriangleException("Nhap sai"); //Dùng public IllegalTriangleException(String message)

        }
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
}