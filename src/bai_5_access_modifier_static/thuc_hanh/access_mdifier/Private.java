package bai_5_access_modifier_static.thuc_hanh.access_mdifier;

class A {

    private int data = 40;

    private void msg() {
        System.out.println("Hello java");
    }

}

public class Private {

    public static void main(String args[]) {

        A obj = new A();

//        System.out.println(obj.data);//Compile Time Error
//
//        obj.msg();//Compile Time Error

    }

}