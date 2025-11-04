/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l3;
import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        // Initialize variables
        Scanner k = new Scanner(System.in);
        int r, x, y;
        double d;
        // Prompt user
        System.out.print("Enter radius of circle : ");
        r = k.nextInt();
        System.out.print("Enter (X,Y) : ");
        x = k.nextInt();
        y = k.nextInt();        
        System.out.print("The point (" + x + " , " + y + ")");    
        // Calculation
        d = Math.sqrt(x*x +y*y);
        if (d>r) {
           System.out.println(" is not in the circle");
        }
        else {
           System.out.println(" is in the circle");
        }
    }
   
}
