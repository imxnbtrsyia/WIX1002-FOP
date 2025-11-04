/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l3;
import java.util.Scanner;

public class L3Q5 {
    public static void main(String[] args) {
        // Declare variables
        Scanner k = new Scanner(System.in);
        double a, b, c, d, e, f, x, y;
        System.out.print("Enter a, b, c, d, e, f :");
        a = k.nextDouble(); 
        b = k.nextDouble(); 
        c = k.nextDouble(); 
        d = k.nextDouble(); 
        e = k.nextDouble(); 
        f = k.nextDouble(); 
        // Calculation
        if (a*d - b*c == 0) {
            System.out.println("The equation has no solution");
        }
        else {
            x = (e*d-b*f) / (a*d-b*c);
            y = (a*f-e*c) / (a*d-b*c);
            System.out.println("X is " + x + " Y is " + y);        
        }
    }
}
