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
public class CheckStringInput {

    private Scanner input = new Scanner(System.in);

    public CheckStringInput() {
        //Ask them what they want to do, add, subtract, multiply, or divide
        System.out.println("What would you like to do?\n\ta.) Add two numbers.\n\tb.) Subtract two numbers.\n\tc.) Multiply two numbers.\n\td.) Divide two numbers.");
        String userData = input.nextLine();
        //Check if the selection is valid
        if (checkString(userData)) {
            //start the next section
            new CheckIntInput(userData);
        } else {
            System.out.println("Please enter a, b, c, or d");
            new CheckStringInput();
        }
    }

    public boolean checkString(String selection) {
        return selection.equalsIgnoreCase("a") || selection.equalsIgnoreCase("b") || selection.equalsIgnoreCase("c") || selection.equalsIgnoreCase("d");
    }
}
