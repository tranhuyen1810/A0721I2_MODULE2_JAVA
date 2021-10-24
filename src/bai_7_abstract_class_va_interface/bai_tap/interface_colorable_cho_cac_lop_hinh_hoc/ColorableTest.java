package bai_7_abstract_class_va_interface.bai_tap.interface_colorable_cho_cac_lop_hinh_hoc;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] items = new Shape[3];
        items[0] = new Circle(3.7);
        items[1] = new Rectangle(4.7, 5.7);
        items[2] = new Square(5.8, "yellow", true);
        for (Shape item : items) {
            System.out.println(item.getArea());
            if (item instanceof Square) {
                ((Colorable) item).howToColor();
            }

//            if(shape instanceof Circle){
//                System.out.println("Area of a Circle: "+((Circle)shape).getArea());
//            }
//            if(shape instanceof Rectangle){
//                System.out.println("Area of a Rectangle: "+ ((Rectangle)shape).getArea());
//            }
//            if(shape instanceof Square){
//                System.out.println("Area of a Square: "+ ((Square)shape).getArea());
//                ((Colorable) shape).howToColor();
//            }
//            if (item instanceof Colorable) {
//                ((Colorable) item).howToColor();
//            }
        }
    }
}
