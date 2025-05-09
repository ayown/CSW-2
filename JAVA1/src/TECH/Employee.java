package JAVA1.src.TECH;

class Employee extends Person {
    int id;
    double salary;


    void setDetails(String name,int age,int id, double salary){
        super.setDetails(name,age);
        this.id=id;
        this.salary=salary;
    }

}
