package bai_12_java_collection_framework.baitap.su_dung_arraylist_trong_java_collection;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}