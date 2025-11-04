/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l2;
import java.util.Scanner;
/**
 *
 * @author Shasha
 */
public class L2Q6 {
    public static void main(String[] args) {
        // Initialize variables
        Scanner k = new Scanner(System.in);
        // Declare variables
        double M, iniTemp, finTemp, Q;
        // Prompt user
        System.out.print("Enter the amount of water in gram: ");
        M = k.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        iniTemp = k.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        finTemp = k.nextDouble();
        // Calculation
        Q = (M /1000)* ((finTemp-32) - (iniTemp-32))/1.8*4184;
        System.out.printf("The energy needed is %e\n", Q);
    }
}
