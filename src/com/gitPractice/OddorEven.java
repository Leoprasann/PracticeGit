package com.gitPractice;

import java.util.Scanner;
public class OddorEven {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Take input from user
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        // Logic to check odd or even
		        if (number % 2 == 0) {
		            System.out.println(number + " is Even.");
		        } else {
		            System.out.println(number + " is Odd.");
		        }

		        scanner.close();
		    }

}
