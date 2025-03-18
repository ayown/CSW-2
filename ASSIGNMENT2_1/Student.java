package ASSIGNMENT2_1;

public class Student<T> {
    public String name;
    public T rollNumber;
    public int age;

    public Student(String name, T rollNumber, int age) {
        this.name=name;
        this.rollNumber=rollNumber;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public T getRollNumber() {
        return rollNumber;
    }
}
class Driver {


    public static void main(String[] args) {
        Student<String> st = new Student<>("Aman","3A",30);
        Student<Integer> st1 = new Student<>("Ayush",53,25);
        System.out.println("Student details when the rollNumber is string: "+ st.getName()+" "+st.getRollNumber()+" "+st.getAge());
        System.out.println("Student details when the rollNumber is integer: "+ st1.getName()+" "+st1.getRollNumber()+" "+st1.getAge());
    }
}