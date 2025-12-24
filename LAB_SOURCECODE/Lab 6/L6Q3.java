/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l6;
import java.util.Random;

public class L6Q3 {
    public static void main(String[] args) {
        final int MAX=10001;
        int[] num = new int[10];
        //int max = 0;
        Random r = new Random();
        // Store elements
        for(int i = 0; i < 10; i++) {
            num[i] = r.nextInt(MAX);
        }
        // Display array
        System.out.println("The original array is :");
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "  ");
        }
        reverseDigit(num);
        System.out.println("\nAfter Reverse :");
        for(int i=0; i<10; i++) {
            System.out.print(num[i] + "  ");
        }
    }


    public static void reverseDigit(int[] a) {
        int b = 0, c;
        for(int i = 0; i < a.length; i++) {
            c = a[i]; // 123
            while (c > 0) {
                b = b*10 + c%10; // b = 0 + 3 = 3; b = 3*10 + 2 = 32; b = 320 + 1 = 321 (reversed)
                c = c/10; // c = 12; c = 1; c = 0
            }    
            a[i] = b; 
            b = 0; // reset b
        }
    }

}
