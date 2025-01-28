package JAVA1.src.DEPARTMENT;

public class Employee {
    static String name; static int id; static double salary;

    public Employee(String name, int id, double salary) {
    }

    public Employee() {

    }

    public void setEmployee(String name, int id, double salary) {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }


    public void displayEmpdetails(){
        System.out.println("JAVA1.src.DEPARTMENT.Employee name: "+name);
        System.out.println("JAVA1.src.DEPARTMENT.Employee ID: "+id);
        System.out.println("JAVA1.src.DEPARTMENT.Employee Salary: "+salary);

    }

}