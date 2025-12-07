/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l5;
import java.util.Random;

public class L5Q2 {
    public static void main(String[] args) {
        // Initialize variables
        final int MAX = 21;
        int[] number = new int[10];
        int temp;
        boolean status;
        Random g = new Random();
        for(int i = 0; i < number.length; i++) { // 1st iteration - randomize number
            status = true; 
            temp = g.nextInt(MAX); 
            for(int j = 0; j < i; j++) // 2nd iteration - checking current element to previous elements
                if (temp == number[j]) {
                    status = false; // number is equals
                    break;
                }
            if (status) // after checking that the number is not duplicated
                number[i] = temp; // assign number as the element
            else
               i--;  // move backward to reset index
        }
        // Display array
        System.out.println("10 non-duplicate random integer within the range from 0 to 20");
        for(int i = 0; i < number.length; i++)
            System.out.print(number[i] + " ");
        System.out.println();
    }

}
