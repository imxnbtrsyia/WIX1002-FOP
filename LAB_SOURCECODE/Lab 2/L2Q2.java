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
public class L2Q2 {
    public static void main(String[] args) {
        // Initialize variables
        Scanner scanner = new Scanner(System.in);
        // Declare variables
        double price, downPayment, interestRate, monthlyPayment;
        int years;
        // Prompt user
        System.out.print("Enter the price of the car: ");
        price = scanner.nextDouble();
        System.out.print("Enter the downpayment:");
        downPayment = scanner.nextDouble();
        System.out.print("Enter the interest rate in %:");
        interestRate = scanner.nextDouble();
        System.out.print("Enter the loan duration in year:");
        years = scanner.nextInt();   
        // Calculation
        monthlyPayment = (price - downPayment) * (1 + interestRate*years/100) / (years*12);
        System.out.printf("The monthly payment is : RM%.2f\n", monthlyPayment);
    }
}
