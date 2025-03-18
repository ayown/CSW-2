package COLLECTIONS;
//write a java program to store and retrieve employee records using a Hashtable. 1.add 6 employees(name and department). 2.search for an employee using employee id. 3.remove an employee from the system. 4.update employee details. 5.display all employees in the system. 
import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return "Name: " + name + ", Department: " + department;
    }
}

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employees = new Hashtable<>();

        employees.put(101, new Employee("Abhi", "HR"));
        employees.put(102, new Employee("Kumar", "IT"));
        employees.put(103, new Employee("Aa g", "Finance"));
        employees.put(104, new Employee("pu", "Marketing"));
        employees.put(105, new Employee("Charlie", "Sales"));
        employees.put(106, new Employee("Dave", "IT"));

        int searchId = 102;
        if (employees.containsKey(searchId)) {
            System.out.println("Employee found: " + employees.get(searchId));
        } else {
            System.out.println("Employee not found.");
        }

        int removeId = 105;
        employees.remove(removeId);
        System.out.println("Employee with ID " + removeId + " removed.");

        int updateId = 103;
        if (employees.containsKey(updateId)) {
            employees.put(updateId, new Employee("Bob", "Operations"));
            System.out.println("Employee with ID " + updateId + " updated.");
        }

        System.out.println("\nAll employees:");
        Enumeration<Employee> employeeList = employees.elements();
        while (employeeList.hasMoreElements()) {
            System.out.println(employeeList.nextElement());
        }
    }
}
