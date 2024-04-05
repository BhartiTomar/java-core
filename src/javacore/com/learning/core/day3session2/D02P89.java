package javacore.com.learning.core.day3session2;

import java.util.Hashtable;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
this.id = id;
this.name = name;
        this.department = department;
        this.designation = designation;
    }

 
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
    }
 
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
return id == employee.id;
    }
}
 
public class D02P89 {
    public static void main(String[] args) {
 
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        employeeTable.put(101, new Employee(101, "John Doe", "Finance", "Manager"));
        employeeTable.put(102, new Employee(102, "Jane Smith", "HR", "Recruiter"));
        employeeTable.put(103, new Employee(103, "Mike Johnson", "IT", "Developer"));
        employeeTable.put(104, new Employee(104, "Emily Brown", "Marketing", "Analyst"));

        System.out.println(employeeTable.isEmpty());
    }
}