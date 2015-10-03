/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.eohdorr.lab2;

/**
 *
 * @author Frostalf
 */
public class Equation {

    private int answer;

    public Equation(int Num1, int Num2, String selection) {
        if (selection.equalsIgnoreCase("a")){
            answer = Num1 + Num2;
        }

        if (selection.equalsIgnoreCase("b")){
            answer = Num1 - Num2;
        }

        if (selection.equalsIgnoreCase("c")){
			answer = Num1 * Num2;
        }

        if (selection.equalsIgnoreCase("d")){
			answer = Num1 / Num2;
        }
        System.out.println("Your answer is: " + String.valueOf(answer));
    }
}
