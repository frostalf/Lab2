/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.eohdorr.lab2;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Frostalf
 */
public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Ask them what they want to do, add, subtract, multiply, or divide
		System.out.println("What would you like to do?\n\ta.) Add two numbers.\n\tb.) Subtract two numbers.\n\tc.) Multiply two numbers.\n\td.) Divide two numbers.");

		//Get input from the user
		String userData = input.nextLine();
		//Check if they entered a, b, c, or d
		List<Object> test = null;
		if (test != null && !test.isEmpty()) {

			//Now ask for two numbers
			System.out.println("Now, please enter two numbers:\n\tNumber 1:");
			//Now GET two numbers
			int Num1 = input.nextInt();
			System.out.println("\tNumber 2:");
			int Num2 = input.nextInt();

			if (userData.equals("a"))
			{
				int answer = Num1 + Num2;
				System.out.println("Your answer is: " + String.valueOf(answer));
			}
			else if (userData.equals("b"))
			{
				int answer = Num1 - Num2;
				System.out.println("Your answer is: " + String.valueOf(answer));
			}
			else if (userData.equals("c"))
			{
				int answer = Num1 * Num2;
				System.out.println("Your answer is: " + String.valueOf(answer));
			}
			else if (userData.equals("d"))
			{
				int answer = Num1 / Num2;
				System.out.println("Your answer is: " + String.valueOf(answer));
			}
			else
			{
				System.out.println("Please enter a, b, c, or d");

				continue;
			}
		}
			//Tell them the errors of their ways.
			//System.out.println("That's not an 'a', 'b', 'c', or 'd'! Please try again.");
			//re-Ask them what they want to do, add, subtract, multiply, or divide
			//System.out.println("What would you like to do?\n\ta.) Add two numbers.\n\tb.) Subtract two numbers.\n\tc.) Multiply two numbers.\n\td.) Divide two numbers.");

			//Get input from the user
			//userData = input.nextLine();
	}
	}

}
