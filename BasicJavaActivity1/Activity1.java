/**
*
*/
package com.bpi.helloworld.main;
 
/**
*
*/
 
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("What is your name? ");
        String name = scanner.nextLine(); //input
        System.out.println("Hello, " + name + "!");
 
        scanner.close();
 
	}
 
}
