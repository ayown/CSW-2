package COLLECTIONS;

import java.util.*;

class Patient {
    String name;
    int age;
    patient next;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
    }
}

public class HospitalManagement {
    private static patient head = null;

    public static void addPatient(String name, int age) {
        patient newPatient = new patient(name, age);
        if (head == null) {
            head = newPatient;
        } else {
            patient temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newPatient;
        }
        System.out.println("Patient " + name + " has been added to the waiting list.");
    }

    public static void removePatient() {
        if (head == null) {
            System.out.println("No patients in the waiting list.");
            return;
        }

        patient temp = head;
        head = head.next;
        System.out.println("Patient " + temp.name + " has been seen by the doctor and removed from the waiting list.");
    }

    public static void checkPatient(String name) {
        patient temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("Patient " + name + " is in the waiting list.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Patient " + name + " is not in the waiting list.");
    }

    public static void displayPatients() {
        if (head == null) {
            System.out.println("No patients in the waiting list.");
            return;
        }

        patient temp = head;
        System.out.println("Patients in the waiting list:");
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", Age: " + temp.age);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ch;

        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add patient to the waiting list");
            System.out.println("2. Remove patient from the waiting list");
            System.out.println("3. Check if a patient is in the waiting list");
            System.out.println("4. Display all patients in the waiting list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String n = sc.nextLine();
                    System.out.print("Enter patient age: ");
                    int a = sc.nextInt();
                    addPatient(n, a);
                    break;

                case 2:
                    removePatient();
                    break;

                case 3:
                    System.out.print("Enter patient name to check: ");
                    n = sc.nextLine();
                    checkPatient(n);
                    break;

                case 4:
                    displayPatients();
                    break;

                case 5:
                    System.out.println("Exiting the system...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
