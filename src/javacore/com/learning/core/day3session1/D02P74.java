package javacore.com.learning.core.day3session1;

import java.util.HashSet;
import java.util.Iterator;
 
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
 
public class D02P74 {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();

        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Swift"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));

        String removeProductId = "P002";
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(removeProductId)) {
                iterator.remove();
                break;
            }
        }

        for (Product product : products) {
            System.out.println(product);
        }
    }
}