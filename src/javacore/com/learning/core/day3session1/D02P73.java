package javacore.com.learning.core.day3session1;

import java.util.HashSet;
import java.util.Scanner;
 
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
        return "Product ID: " + productId + ", Product Name: " + productName;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }
 
    @Override
    public int hashCode() {
        return productId.hashCode();
    }
}
 
public class D02P73 {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();

        products.add(new Product("P001", "Product A"));
        products.add(new Product("P002", "Product B"));
        products.add(new Product("P003", "Product C"));
        products.add(new Product("P004", "Product D"));
 
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID and name (e.g., P003 Maruti Dezire): ");
        String[] input = scanner.nextLine().split("\\s+");

        products.add(new Product(input[0], input[1]));

        String searchProductId = input[0];
        boolean found = false;
        for (Product product : products) {
            if (product.getProductId().equals(searchProductId)) {
                found = true;
                break;
            }
        }
 
        if (found) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }
}
