/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l5;
import java.util.Scanner;

public class L5Q6 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        // Prompt user
        System.out.println("Enter the number of row of Pascal Triangle to generate: ");
        int num = k.nextInt();
        int [][] pascal = new int[num][num];
        System.out.println("The Pascal Triangle with "+num+" row(s)");
        
        // Store elements for array
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) { 
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                    continue;
                } else if (j < i) {
                    pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1]; // Summing 2 numbers above
                }
            }
        }
        
        // Display array
        for(int i = 0; i < num; i++){
            for (int j = 0; j < num; j++) {
                System.out.print(pascal[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
