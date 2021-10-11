package bai_4_lop_va_doi_tuong_java.baitap.xay_dung_lop_fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
//        if (on) {
//            return "speed=" + speed+" " + "color=" +color+ " " + "radius="+radius + " fan is on";
//        } else {
//            return "speed=" + speed+" " + "color=" +color+ " " + "radius="+radius + " fan is off";
//        }

        //toan tu 3 ngoi
        return on? "speed=" + speed+" " + "color=" +color+ " " + "radius="+radius + " fan is on":
                "speed=" + speed+" " + "color=" +color+ " " + "radius="+radius + " fan is off";
    }
}
