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
        return Double.hashCode(price);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0;
    }
 
    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}
 
public class D02P88 {
    public static void main(String[] args) {

        TreeMap<Double, Car> carMap = new TreeMap<>();

        carMap.put(80050.0, new Car("Bugatti", 80050.0));
        carMap.put(305000.0, new Car("Swift", 305000.0));
        carMap.put(600100.0, new Car("Audi", 600100.0));
        carMap.put(900000.0, new Car("Benz", 900000.0));

        Map.Entry<Double, Car> greatestEntry = carMap.pollLastEntry();
        System.out.println(greatestEntry.getValue());

        double keyToReplace = 80050.0;
        carMap.replace(keyToReplace, new Car("Reva", keyToReplace));
        System.out.println(carMap.get(keyToReplace));
    }
}
