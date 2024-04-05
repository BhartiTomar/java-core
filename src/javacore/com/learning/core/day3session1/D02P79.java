package javacore.com.learning.core.day3session1;

import java.util.*;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;
 
    public Person(int id, String name, int age, double salary) {
this.id = id;
this.name = name;
        this.age = age;
        this.salary = salary;
    }
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public double getSalary() {
        return salary;
    }
 
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
return id == person.id;
    }
 
    @Override
    public int compareTo(Person o) {
return Integer.compare(this.id, o.id);
    }
}
 
public class D02P79 {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person(101, "Alice", 30, 4000));
        people.add(new Person(102, "Bob", 35, 5000));
        people.add(new Person(103, "Charlie", 25, 3000));
        people.add(new Person(104, "David", 40, 6000));
        people.add(new Person(105, "Eva", 28, 4500));
        people.add(new Person(106, "Frank", 32, 5500));
 
        double sum = 0;
        for (Person person : people) {
            sum += person.getSalary();
        }
 
        System.out.println(sum);
    }
}