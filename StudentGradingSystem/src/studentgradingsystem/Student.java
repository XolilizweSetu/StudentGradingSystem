/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentgradingsystem;

import java.util.HashMap;
import java.util.Map;

// Student class to represent each student and their grades
public class Student {
    private String name;
    private String studentId;
    private Map<String, Double> grades;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, double grade) {
        grades.put(subject, grade);
    }

    public double calculateAverage() {
        return grades.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public String getReport() {
        return "Name: " + name + "\nID: " + studentId + "\nGrades: " + grades + "\nAverage: " + calculateAverage();
    }

    public String getStudentId() {
        return studentId;
    }
}
