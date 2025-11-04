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
public class L2Q4 {
    public static void main(String[] args) {
        // Initialize variables
        Scanner k = new Scanner(System.in);
        // Declare variables
        int input, hour, min, sec;
        // Prompt user
        System.out.print("Enter the number of seconds: ");
        input = k.nextInt();
        // Calculation
        hour = input / 3600;//60x60
        sec = input%3600;
        min = sec/60;
        sec %= 60;
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds\n", input, hour, min, sec);
        //system.out.printf(" ", );
    }
}
