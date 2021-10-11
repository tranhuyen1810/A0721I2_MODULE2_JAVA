package bai_4_lop_va_doi_tuong_java.baitap.xay_dung_lop_fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        System.out.println(fan1);
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");
        System.out.println(fan2);
//        Fan fan1 = new Fan(3, true, 10, "yellow");
//        System.out.println(fan1);
//        Fan fan2 = new Fan(2, false, 5, "blue");
//        System.out.println(fan2);
    }
}
