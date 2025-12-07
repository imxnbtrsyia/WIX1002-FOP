/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l5;
import java.util.Random;
import java.util.Scanner;

public class L5Q3 {
    public static void main(String[] args) {
        // Initialize variables
        final int MAX = 8;
        int N;
        Random r = new Random();
        int[][] work; // 2D array
        Scanner k = new Scanner(System.in);    
        System.out.print("Enter N employees: ");
        N = k.nextInt();
        work = new int[N][7]; // N employees, 7 days
        for(int i = 0; i < work.length; i++)
            for(int j = 0; j < 7; j++)
                work[i][j] = 1 + r.nextInt(MAX);// ensure the randomized within the range 1-8 hrs
        // Display array in 2D form
        System.out.println("             Sun Mon Tue Wed Thu Fri Sat ");
        for(int i = 0; i < work.length; i++) {
            System.out.print("Employee " + (i+1) + " ");
            for(int j = 0; j < 7; j++)
                System.out.printf("%4d",work[i][j]);
            System.out.println("");
        }
        System.out.println("\nTotal Work Hours");

        for(int i = 0; i < work.length; i++) { // Access employee
            System.out.print("Employee " + (i+1) + " : ");
            int sum = 0;
            for(int j = 0; j < 7; j++) { // Access each hours for that employee
                sum += work[i][j]; // Total hours of the employee
            }
            System.out.println(sum);
        }

    }
}
