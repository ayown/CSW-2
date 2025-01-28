package JAVA1.src.TECH;
import java.util.*;
class Developer extends Employee {
    String programmingLanguage;
    String project;


    public void setDetails(String name, int age, int id, double salary, String programmingLanguage, String project) {
        super.setDetails(name, age, id, salary);
        this.programmingLanguage = programmingLanguage;
        this.project = project;
    }

    public void getDeveloperDetails() {
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee age: "+age);
        System.out.println("Employee salary: "+salary);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Project: " + project);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Developer D=new Developer();
        D.setDetails("ab",25,51616,89000,"java","web-dev");
        System.out.println("Developer Details:");
        D.getDeveloperDetails();
    }
}
