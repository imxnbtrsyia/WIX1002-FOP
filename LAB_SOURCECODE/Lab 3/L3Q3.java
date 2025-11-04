/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l3;
import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        // Declare variables
        double sales, commission = 0;
        Scanner k = new Scanner(System.in);
        // Prompt user
        System.out.print("Enter the sales volume: ");
        sales = k.nextDouble(); // 1200
        if (sales > 1000) {
            commission = (sales - 1000) * 12.5/100 // 200 x 12.5%j
                        + 500 * 10/100                                    
                        + 400 * 7.5/100 
                        + 100 * 5/100;
        }
        else if (sales > 500) {
            commission = (sales - 500) * 10/100 
                        + 400 * 7.5/100 
                        + 100 * 5/100;
        }
        else if (sales > 100) {
            commission = (sales - 100) * 7.5/100 
                        + 100 * 5/100;
        }
        else if (sales > 0) {
            commission = sales * 5/100;
        }
        else {
          System.out.println("Invalid sales volume: ");
        }
        // Display
        System.out.printf("Total commission is %.2f\n", commission);

    }
}
