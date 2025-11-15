/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l4;
import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] args) {
        // Initialize variables
        int n, sum = 0;
        Scanner k = new Scanner(System.in);
        // Prompt user
        System.out.print("Enter a number n : ");
        // User input
        n = k.nextInt();
        for(int i = 1; i <= n; i++) { // Represents each cycle
            for(int j = 1; j <= i; j++) { // Represents each term
                sum += j;
            }
        }
         System.out.println("The sum of the series is " + sum);
    }
}
