package JAVA1.src.Encapsulation;

public class Student {
    private String name; private int age; private double marks;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if (age>0){
            this.age=age;
        }
        else{
            System.out.println("Age is not defined");
        }
    }
    public void setMarks(double marks){
        if (marks>=0 && marks<=100){
            this.marks=marks;
        }
        else {
            System.out.println("wrong marks");
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getMarks() {
        return marks;
    }
    public void displayStudentInfo(){
        System.out.println("Name of student: "+name);
        System.out.println("Age of student: "+age);
        System.out.println("Marks of student: "+marks);

    }
}
class Main{
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println("Name, Age and Marks of student respectively are: ");
        s.setName("ayan");
        s.setAge(22);
        s.setMarks(95.0);
        s.displayStudentInfo();
        s.setAge(-5);
        s.setMarks(105);
        System.out.println("Updated age and marks of student: "+ s.getAge()+" "+s.getMarks());
    }
}
