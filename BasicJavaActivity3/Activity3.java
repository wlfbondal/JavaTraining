
package com.bpi.helloworld.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        // First integer
        System.out.print("Enter first integer: ");
        int System.out.print("Enter second integer: ");        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();

        // Calculations
        int sum = firstInt + secondInt;
        int difference = firstInt - secondInt;
        int product = firstInt * secondInt;

        // Display
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Close scanner
        scanner.close();
    }
}
