/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l6;
import java.util.Random;
import java.util.Scanner;

public class L6Q5 {
     public static void main(String[] args) {
         // Initialize variables
        int a, b, ans, score=0;
        Random r = new Random();
        Scanner c = new Scanner(System.in);

        do {
            a = r.nextInt(13);
            b = r.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.print(a + " x " + b + " = ");
            ans = c.nextInt();
            if (ans < 0)
                break;
            else {
                if (checkEqual(a, b, ans))
                    score++;
            }
        } while(ans >= 0);
        System.out.println("Your Score is " + score);
    
    }
    
    public static boolean checkEqual(int a, int b, int ans) {
        return (a*b == ans);
    }

}
