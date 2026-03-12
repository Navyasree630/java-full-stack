package day6;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                Student s = new Student(id, name, age);
                students.add(s);

                System.out.println("Student Added Successfully!");

            } 
            else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    for (Student s : students) {
                        System.out.println("ID: " + s.id + 
                                           ", Name: " + s.name + 
                                           ", Age: " + s.age);
                    }
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter Student ID to update: ");
                int id = sc.nextInt();
                sc.nextLine();

                boolean found = false;

                for (Student s : students) {
                    if (s.id == id) {
                        System.out.print("Enter new name: ");
                        s.name = sc.nextLine();

                        System.out.print("Enter new age: ");
                        s.age = sc.nextInt();

                        System.out.println("Student Updated Successfully!");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

            } 
            else if (choice == 4) {
                System.out.print("Enter Student ID to delete: ");
                int id = sc.nextInt();

                boolean removed = students.removeIf(s -> s.id == id);

                if (removed) {
                    System.out.println("Student Deleted Successfully!");
                } else {
                    System.out.println("Student not found.");
                }

            } 
            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
} 