
package com.bpi.helloworld.main.BasicJavaActivity3;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {

        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        // First integer
        System.out.println("Enter first integer: ");
        int firstInt = scanner.nextInt();
        System.out.println("Enter second integer: ");        
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
