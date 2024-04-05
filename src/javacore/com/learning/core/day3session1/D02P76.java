package javacore.com.learning.core.day3session1;

import java.util.TreeSet;

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

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int compareTo(Person other) {
return Integer.compare(this.id, other.id);
    }
}
 
public class D02P76 {
    public static void main(String[] args) {
        TreeSet<Person> personsSet = new TreeSet<>();

        personsSet.add(new Person(1, "Jerry", 30, 999.0));
        personsSet.add(new Person(2, "Smith", 40, 2999.0));
        personsSet.add(new Person(3, "Popeye", 50, 5999.0));
        personsSet.add(new Person(4, "Jones", 60, 6999.0));
        personsSet.add(new Person(5, "John", 32, 1999.0));
        personsSet.add(new Person(6, "Tom", 42, 3999.0));

        System.out.println("Id Name Salary:");
        for (Person person : personsSet) {
            System.out.println(person);
        }
    }
}