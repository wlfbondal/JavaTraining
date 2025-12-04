package com.bpi.helloworld.main;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = "";
        String studentId = "";
        int numSubjects = 0;
        double totalGrades = 0.0;
        double average = 0.0;
        String status = "";
        char choice;

        do {
            System.out.println("\n===== STUDENT GRADING SYSTEM =====");
            System.out.println("A - Add Student Information");
            System.out.println("B - Compute Student Average");
            System.out.println("C - Display Student Information");
            System.out.println("D - Exit");
            System.out.print("Enter choice: ");
            
            // Initialization for choice
            choice = scanner.nextLine().toUpperCase().charAt(0);

            switch (choice) {
                case 'A':
                    // Reset previous data
                    totalGrades = 0.0;
                    average = 0.0;
                    status = "";

                    System.out.print("Enter student name: ");
                    studentName = scanner.nextLine();

                    System.out.print("Enter student ID: ");
                    studentId = scanner.nextLine();

                    System.out.print("Enter number of subjects: ");
                    numSubjects = Integer.parseInt(scanner.nextLine());

                    for (int i = 1; i <= numSubjects; i++) {
                        System.out.print("Enter grade for subject " + i + ": ");
                        double grade = Double.parseDouble(scanner.nextLine());
                        totalGrades += grade;
                    }
                    System.out.println("===== STUDENT SAVED =====");

                    break;

                case 'B':
                    if (studentName.isEmpty() || studentId.isEmpty() || numSubjects <= 0) {
                        System.out.println("No student information found. Please add student info first.");
                    } else {
                        average = totalGrades / numSubjects;
                        status = (average >= 75) ? "PASS" : "FAIL";
                        System.out.printf("Average: %.2f%n", average);
                        System.out.println("Status: " + status);
                    }
                    break;

                case 'C':
                    if (studentName.isEmpty() || studentId.isEmpty() || numSubjects <= 0) {
                        System.out.println("No student information found. Please add student info first.");
                    } else {
                        System.out.println("===== STUDENT SUMMARY =====");
                        System.out.println("Student Name : " + studentName);
                        System.out.println("Student ID   : " + studentId);
                        System.out.printf("Average Grade: %.2f%n", average);
                        System.out.println("Status       : " + status);
                        System.out.println("===========================");
                    }
                    break;

                case 'D':
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 'D');

        scanner.close();
    }
}
