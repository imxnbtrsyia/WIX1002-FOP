/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l2;
import java.util.Random;
/**
 *
 * @author Shasha
 */
public class L2Q3 {
    public static void main(String[] args) {
        // Declare variables
        int num1, num2, num3;
        final int MAX = 41; 
        Random random = new Random();
        // Randomize
        num1 = 10 + random.nextInt(MAX);
        num2 = 10 + random.nextInt(MAX);
        num3 = 10 + random.nextInt(MAX);
        // Calculation
        System.out.println("The numbers are " + num1 + " " + num2 + " " + num3);
        System.out.println("Sum :" + (num1 + num2 + num3));
        System.out.println("Average : " + (num1 + num2 + num3)/ 3.0);
    }
}
