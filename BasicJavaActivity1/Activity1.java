/**
*
*/
package com.bpi.helloworld.main.BasicJavaActivity1;
 
/**
*
*/
 
import java.util.Scanner;
 
public class Activity1 {
 
	public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("What is your name? ");
        String name = scanner.nextLine(); //input
        System.out.println("Hello, " + name + "!");
 
        scanner.close();
 
	}
 
}
