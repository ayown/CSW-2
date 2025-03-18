package ASSIGNMENT2_1;

import java.util.*;

public class Student4 implements Comparable<Student4> {
    String name;
    int rollNumber;
    double totalMark;

    public Student4(String name, int rollNumber, double totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }

    @Override
    public int compareTo(Student4 other) {
        return Integer.compare(this.rollNumber, other.rollNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", totalMark=" + totalMark +
                '}';
    }
}

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student4[] students = {
                new Student4("Nandini", 4004, 95.5),
                new Student4("Er.Satya CMD", 9715, 91.2),
                new Student4("Suvam", 7068, 88.2),
                new Student4("Rupankar", 7046, 76.8),
                new Student4("Basu", 7002, 89.3)
        };



        Arrays.sort(students);
        for(Student4 s: students){
            System.out.println(s+" ");
        }
        System.out.print("Enter the roll number to search: ");
        int searchRollNumber = sc.nextInt();
        Student4 foundStudent = linearSearch(students, searchRollNumber);

        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent);
        } else {
            System.out.println("Student with roll number " + searchRollNumber + " not found.");
        }

        sc.close();
    }

    public static Student4 linearSearch(Student4[] students, int rollNumber) {
        for (Student4 student : students) {
            if (student.rollNumber == rollNumber) {
                return student;
            }
        }
        return null;
    }
}
