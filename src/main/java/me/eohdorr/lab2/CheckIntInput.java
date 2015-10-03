/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.eohdorr.lab2;

import java.util.Scanner;

/**
 *
 * @author Frostalf
 */
public class CheckIntInput {

    private Scanner input = new Scanner(System.in);

    public CheckIntInput(String selection) {
        System.out.println("Now, please enter two numbers:\n\tNumber 1:");
        String Num1 = input.nextLine();
		System.out.println("\tNumber 2:");
		String Num2 = input.nextLine();

        if (CheckInts(Num1, Num2)) {
            new Equation(Integer.valueOf(Num1), Integer.valueOf(Num2), selection);
        } else {
            System.out.println("Please enter valid numbers");
            new CheckIntInput(selection);
        }
    }

    public boolean CheckInts(String num1, String num2) {
        try {
            Integer.parseInt(num1);
            Integer.parseInt(num2);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}
