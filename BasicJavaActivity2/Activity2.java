/**
*
*/
package com.bpi.helloworld.main.BasicJavaActivity2;
 
/**
*
*/
 
import java.util.Scanner;
 
public class Activity2 {
 
	public static void main(String[] args) {
		// Open Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Input age
         System.out.print("Enter your age: ");
         int ageInt = scanner.nextInt();
 
         // Convert int to double
         double ageDouble = (double) ageInt;
 
         // Display results
         System.out.println("Your age as int: " + ageInt);
         System.out.println("Your age as double: " + ageDouble);
 
         // Close scanner
         scanner.close();
	}
 
}
