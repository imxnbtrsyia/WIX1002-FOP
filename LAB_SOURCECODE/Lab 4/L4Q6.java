/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l4;
import java.util.Random;

public class L4Q6 {
    public static void main(String[] args) {
        // Initialize variables
        int num, count = 1;
        Random g = new Random();
        // Randomize number
        num = g.nextInt(Integer.MAX_VALUE);
        System.out.println("The random in integer is " + num);
        while (num > 9){
            num/=10; // Delete one digit per loop
            count++; // Increment total digits by one
        } 
        System.out.println("It consists of " + count + " digit(s)");

    }
}
