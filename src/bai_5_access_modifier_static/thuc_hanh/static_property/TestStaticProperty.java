package bai_5_access_modifier_static.thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1=new Car("BMW","N52");
        System.out.println(Car.numberOfCar);
        Car car2=new Car("Vinfast","Lux A2.0");
        System.out.println(Car.numberOfCar);
    }
}
