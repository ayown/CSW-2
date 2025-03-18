package ASSIGNMENT4;
class Student {
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    protected void finalize() {
        System.out.println(name + " has been successfully garbage collected!");
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name + ", Course: " + course);
    }
}

public class q7_UniversityEnrollment {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        System.out.println("Initial Total Memory: " + runtime.totalMemory() + " bytes");
        System.out.println("Initial Free Memory: " + runtime.freeMemory() + " bytes");

        Student student1 = new Student("John Doe", "Computer Science");
        Student student2 = new Student("Jane Smith", "Mechanical Engineering");

        student1.displayDetails();
        student2.displayDetails();

        student1 = null;
        student2 = null;

        System.gc();

        System.out.println("Memory After GC - Total Memory: " + runtime.totalMemory() + " bytes");
        System.out.println("Memory After GC - Free Memory: " + runtime.freeMemory() + " bytes");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
