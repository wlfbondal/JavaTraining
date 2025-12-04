
package com.bpi.helloworld.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Minor");
        } else if (age >= 18 && age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        // Close scanner
        scanner.close();
    }
}
