/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fop_l5;
import java.util.Random;
import java.util.Scanner;
public class L5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize variables
        Random r = new Random();
        final int MAX=101;
        int[] score;
        int N;
        Scanner k = new Scanner(System.in); 
        // Prompt user
        System.out.print("Enter N students: ");
        N = k.nextInt();
        // Initialize array with its size
        score = new int[N];
        // Store scores into array
        for(int i = 0; i < N; i++)
            score[i] = r.nextInt(MAX);
        int low, high, sum = 0;
        // score{ 1 2 3 4 5 }
        low = score[0]; // 1
        high = score[0]; // 2
        sum = score[0]; // 1
        // Check each elements to determine highest and lowest & sum all numbers
        for(int i = 1; i < N; i++) { // start with i = 1 because already defined previous variables to i = 0
            if (score[i]>high)
                high = score[i];
            if (score[i]<low)
                low = score[i];        
            sum += score[i];
        }
        // Display all scores
        System.out.print("The list of score: ");
        for(int i = 0; i < N; i++)         
            System.out.print(score[i] + "  ");
        System.out.println("");
        
        System.out.println("Lowest Score : " + low);
        System.out.println("Highest Score : "+ high);
        System.out.printf("Average Score : %.2f\n", (sum / (N*1.0)));
    }
    
}
