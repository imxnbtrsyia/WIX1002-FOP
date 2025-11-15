/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l4;
import java.util.Random;

public class L4Q8 {
    public static void main(String[] args) {
        final int MAX = 100;
        int n;
        Random g = new Random();
        n = g.nextInt(MAX);
        System.out.println("The first " + n + " prime number");
        for(int i = 1, num = 3; i <= n; num += 2) { // += 2 because we know that even numbers are not prime numbers
            if (num%2 == 1) { // it is an odd number
                for(int d = 3; d <= num; d += 2) { // odd numbers (d) starting from 3 to num
                    if (num == d) { // Prime number can be divided by itself
                        i++;
                        System.out.print(num + ", ");
                    }
                    else if (num%d == 0) // Prime number cannot be divided by another number, d
                        break;
                }
            }
            else if (num == 2){ // 2 is a prime number
              System.out.print(num + ", ");
              i++;
            }
        }

    }
}
