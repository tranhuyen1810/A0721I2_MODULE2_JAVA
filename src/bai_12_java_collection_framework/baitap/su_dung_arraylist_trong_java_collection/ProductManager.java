package bai_12_java_collection_framework.baitap.su_dung_arraylist_trong_java_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static List<Product> productList = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void displayMenu() {
        int choice = -1;
        do {
            System.out.println("Please enter choice \n"
                    + "1. Display product list \n"
                    + "2. Add product \n"
                    + "3. Update product \n"
                    + "4. Delete product \n"
                    + "5. Sort Product Descend \n"
                    + "6. Sort Product Ascend \n"
                    + "7. Exit \n");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    displayListProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    sortProductDescend();
                    break;
                case 6:
                    sortProductAscend();
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }

    public static void displayListProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void addProduct() {
        int id;
        do {
            System.out.println("Please enter id");
            id = input.nextInt();
        } while (findById(id) != null);
        input.skip("\\R");
        System.out.println("Please enter name");
        String name = input.nextLine();
        System.out.println("Please enter price");
        double price = input.nextDouble();
        productList.add(new Product(id, name, price));
    }

    public static Product findById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public static void updateProduct() {
        System.out.println("Please enter id");
        int id = input.nextInt();
        Product product = findById(id);
        if (product != null) {
            System.out.println("Please enter information update: \n"
                    + "1. Name product \n"
                    + "2. Price product \n"
                    + "3. Back to menu \n");
            int choice = input.nextInt();
            input.skip("\\R");
            switch (choice) {
                case 1:
                    System.out.println("Please enter name");
                    String newName = input.nextLine();
                    product.setNameProduct(newName);
                    displayMenu();
                    break;
                case 2:
                    System.out.println("Please enter price");
                    double newPrice=input.nextDouble();
                    product.setPrice(newPrice);
                    displayMenu();
                    break;
                case 3:
                    displayMenu();
                    break;
            }
        } else {
            System.out.println("Id not found");
            updateProduct();
        }
    }

    public static void deleteProduct() {
        System.out.println("Please enter id product");
        int id = input.nextInt();
        productList.remove(findById(id));

    }

    public static Product findByName(String name) {
        for (Product product : productList) {
            if (product.getNameProduct().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public static void sortProductDescend() {
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(productList, priceComparator);
        productList.sort(priceComparator);
        System.out.println(productList);
        displayMenu();
    }

    public static void sortProductAscend() {
        PriceComparator priceComparator = new PriceComparator();
        productList.sort(priceComparator);
        Collections.sort(productList, priceComparator);
        Collections.reverse(productList);
        System.out.println(productList);
        displayMenu();
    }


}
