package JAVA1.src.Interfaces;
import java.util.*;
public interface Employee {
    double calculateSalary();
    void displaySalary();
}

class FullTimeEmployeee implements Employee{
    int salary=3000;
    public double calculateSalary() {
        return 40*salary;
    }
    public void displaySalary() {
        System.out.println("the salary of a full time employee is: "+calculateSalary());
    }
    public void setSalary(int sal){
        this.salary=sal;
    }
    public int getSalary(){
        return salary;
    }

}

class PartTimeEmployee implements  Employee{
    int pRates,whours;
    public double calculateSalary() {
        return whours*pRates;
    }

    public void displaySalary() {
        System.out.println("The Salary of a part time employee is: "+calculateSalary());
    }
    public void setPayrates(int payrates){
        this.pRates=payrates;
    }

    public void setWorkhours(int whours) {
        this.whours = whours;
    }

}

class Intern implements  Employee{
    int stipend;
    public double calculateSalary() {
        return stipend;
    }

    public void displaySalary() {
        System.out.println("The salary of an intern is: "+calculateSalary());
    }

    public void setStipend(int stipend) {
        this.stipend = stipend;
    }
}
class EmployeeSystem {
    public static void main(String[] args) {
        FullTimeEmployeee f = new FullTimeEmployeee();
        PartTimeEmployee p =new PartTimeEmployee();
        Intern i =new Intern();
        f.displaySalary();
        p.setPayrates(100);
        p.setWorkhours(10);
        p.displaySalary();
        i.setStipend(900);
        i.displaySalary();
        f.setSalary(3500);
        System.out.println("The updated salary of full time employee is: "+f.getSalary());
    }
}
