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
        return id + " " + name + " " + designation + " " + department;
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
 
public class D02P810 {
    public static void main(String[] args) {
 
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        employeeTable.put(1001, new Employee(1001, "John Doe", "HR", "HR Manager"));
        employeeTable.put(1002, new Employee(1002, "Jane Smith", "Finance", "Financial Analyst"));
        employeeTable.put(1003, new Employee(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1004, new Employee(1004, "Emily Brown", "Marketing", "Marketing Specialist"));

        int searchId = 1003;
        Employee foundEmployee = employeeTable.get(searchId);

        System.out.println(foundEmployee);
    }
}
