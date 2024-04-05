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
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
return id == person.id &&
                age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
Objects.equals(name, person.name);
    }
 
    @Override
    public int compareTo(Person other) {
return Integer.compare(this.id, other.id);
    }
}
 
public class D02P78 {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        // Predefined information of 6 person details
        people.add(new Person(1, "Alice", 30, 4000));
        people.add(new Person(2, "Bob", 35, 5000));
        people.add(new Person(3, "Charlie", 25, 3000));
        people.add(new Person(4, "David", 28, 3500));
        people.add(new Person(5, "Eve", 40, 6000));
        people.add(new Person(6, "Frank", 32, 4500));
 
        // Print the sum of all salaries
        double totalSalary = 0;
        for (Person person : people) {
            totalSalary += person.getSalary();
        }
        System.out.println(totalSalary);
    }
}