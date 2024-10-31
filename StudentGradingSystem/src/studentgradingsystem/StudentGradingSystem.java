/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentgradingsystem;

import java.util.Scanner;
public class StudentGradingSystem {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradingSystem gradingSystem = new GradingSystem();
   

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. Show Reports");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    gradingSystem.addStudent(new Student(name, id));
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    Student student = gradingSystem.findStudentById(studentId);
                    if (student != null) {
                        System.out.print("Enter subject: ");
                        String subject = scanner.nextLine();
                        System.out.print("Enter grade: ");
                        double grade = scanner.nextDouble();
                        student.addGrade(subject, grade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    gradingSystem.displayAllReports();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
