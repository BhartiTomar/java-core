package javacore.com.learning.core.day3session1;

import java.util.HashSet;

class Product {
    private String productId;
    private String productName;
 
    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
 
    public String getProductId() {
        return productId;
    }
 
    public String getProductName() {
        return productName;
    }
 
    @Override
    public String toString() {
        return productId + " " + productName;
    }
}
 
public class D02P72 {
    public static void main(String[] args) {
        HashSet<Product> productsSet = new HashSet<>();

        Product product1 = new Product("P001", "Maruti 800");
        Product product2 = new Product("P002", "Maruti Zen");
        Product product3 = new Product("P003", "Maruti Dezire");
        Product product4 = new Product("P004", "Maruti Alto");

        productsSet.add(product1);
        productsSet.add(product2);
        productsSet.add(product3);
        productsSet.add(product4);

        System.out.println("Product details:");
        for (Product product : productsSet) {
            System.out.println(product);
        }
    }
}