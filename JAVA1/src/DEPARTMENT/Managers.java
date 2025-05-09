package JAVA1.src.DEPARTMENT;

import java.util.*;
public class Managers extends Employee {
    static String department;

    public Managers() {
        super(Employee.name, Employee.id, Employee.salary);
    }

    void setManagers(String name, int id, double salary) {
    }


    void setManagers(String name, int id, double salary,String department){
        this.setManagers(name,id,salary);
        this.department=department;
    }
    public void displayMandetails(){
        displayEmpdetails();
        System.out.println("Manager department: "+department);
    }

    public static void main(String[] args) {
        Managers m=new Managers();
        Employee e=new Employee();
        Scanner in= new Scanner(System.in);
        System.out.println("enter manager department");
        department=in.next();

        e.setEmployee("ayan",123,52000);
        m.setManagers("ab",456,56000,department);
        System.out.println("Employee details");
        e.displayEmpdetails();
        System.out.println();
        System.out.println("Manager details");
        m.displayMandetails();
    }


}
