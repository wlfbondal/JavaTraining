
package com.bpi.helloworld.main;

import java.util.ArrayList;
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lists to store multiple student details
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<String> studentIDs = new ArrayList<>();
        ArrayList<double[]> studentGrades = new ArrayList<>();
        ArrayList<Double> studentAverages = new ArrayList<>();
        ArrayList<String> studentStatus = new ArrayList<>();

        char choice;

        do {
            System.out.println("===== STUDENT GRADING SYSTEM =====");
            System.out.println("A - Add Student Information");
            System.out.println("B - Compute Averages for All Students");
            System.out.println("C - Display All Student Information");
            System.out.println("D - Exit");
            System.out.print("Enter choice: ");
            choice = scanner.next().toUpperCase().charAt(0);

            switch (choice) {
                case 'A':
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter number of subjects: ");
                    int numSubjects = scanner.nextInt();

                    double[] grades = new double[numSubjects];
                    for (int i = 0; i < numSubjects; i++) {
                        System.out.print("Enter grade for subject " + (i + 1) + ": ");
                        grades[i] = scanner.nextDouble();
                    }

                    // Save student info
                    studentNames.add(name);
                    studentIDs.add(id);
                    studentGrades.add(grades);
                    studentAverages.add(0.0); // placeholder
                    studentStatus.add(""); // placeholder

                    System.out.println("===== STUDENT SAVED =====");
                    break;

                case 'B':
                    if (studentNames.isEmpty()) {
                        System.out.println("No student information found. Please add student info first.");
                    } else {
                        for (int i = 0; i < studentGrades.size(); i++) {
                            double[] gradesArray = studentGrades.get(i);
                            double total = 0;
                            for (double grade : gradesArray) {
                                total += grade;
                            }
                            double average = total / gradesArray.length;
                            studentAverages.set(i, average);
                            studentStatus.set(i, (average >= 75) ? "PASS" : "FAIL");
                        }
                        System.out.println("Averages computed for all students.");
                    }
                    break;

                case 'C':
                    if (studentNames.isEmpty()) {
                        System.out.println("No student information found. Please add student info first.");
                    } else {
                        System.out.println("===== ALL STUDENT SUMMARY =====");
                        for (int i = 0; i < studentNames.size(); i++) {
                            System.out.println("Student Name: " + studentNames.get(i));
                            System.out.println("Student ID: " + studentIDs.get(i));
                            System.out.println("Average Grade: " + studentAverages.get(i));
                            System.out.println("Status: " + studentStatus.get(i));
                            System.out.println("===========================");
                        }
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
