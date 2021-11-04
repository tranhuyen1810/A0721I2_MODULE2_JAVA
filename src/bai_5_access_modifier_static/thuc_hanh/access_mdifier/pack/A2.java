package bai_5_access_modifier_static.thuc_hanh.access_mdifier.pack;

import bai_5_access_modifier_static.bai_tap.Circle;

public class A2 {
    public class A2 {
        public void msg(){System.out.println("Hello");}
}

    public static class TestCircle {
        public static void main(String[] args) {
            Circle circle=new Circle(3);
            System.out.println("Ban kinh cua duong tron la: "+circle.getRadius());
            System.out.println("Dien tich cua duong tron la: "+circle.getArea());
        }
    }
