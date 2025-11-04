/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fop_l2;
import java.util.Scanner;
/**
 *
 * @author Shasha
 */
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize variables
        Scanner scanner = new Scanner(System.in);
        // Declare variables
        double fahrenheit, celcius;
        // Prompt user
        System.out.println("Enter temperature in degree Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        // Calculation
        celcius = (fahrenheit - 32) / 1.8;
        System.out.printf("The temperature in degree Celsius is : %.2f\n", celcius);

    }
    
}
