/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentgradingsystem;

import java.util.ArrayList;
import java.util.List;

// GradingSystem class to manage students and their grades
public class GradingSystem {
    private List<Student> students;

    public GradingSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null; // Student not found
    }

    public void displayAllReports() {
        for (Student student : students) {
            System.out.println(student.getReport());
            System.out.println("--------------------");
        }
    }
}

