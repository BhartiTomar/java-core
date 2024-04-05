package javacore.com.learning.core.day3session2;

import java.util.Map;
import java.util.TreeMap;
 
class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
this.name = name;
        this.price = price;
    }

 
    @Override
    public String toString() {
        return name + " " + price;
    }
 
    @Override
    public int hashCode() {
        return name.hashCode();
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
return name.equals(car.name);
    }
 
    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}
 
public class D02P86 {
    public static void main(String[] args) {

        TreeMap<Car, String> carMap = new TreeMap<>();

        carMap.put(new Car("Bugatti", 80050.0), "Fastest car");
        carMap.put(new Car("Swift", 305000.0), "Budget-friendly");
        carMap.put(new Car("Audi", 600100.0), "Luxury");
        carMap.put(new Car("Benz", 900000.0), "Premium");

        for (Map.Entry<Car, String> entry : carMap.descendingMap().entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}