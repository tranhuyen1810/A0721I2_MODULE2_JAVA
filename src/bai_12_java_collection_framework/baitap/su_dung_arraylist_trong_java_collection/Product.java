package bai_12_java_collection_framework.baitap.su_dung_arraylist_trong_java_collection;

public class Product {
    private int id;
    private String nameProduct;
    private double price;
    public Product(){
    }
    public Product(int id, String name, double price) {
        this.id = id;
        this.nameProduct = name;
        this.price = price;
    }

    public Product(int i, String iphone5, String usa, int i1, String aNew) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }
}
