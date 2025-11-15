/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l4;
import java.util.Scanner;

public class L4Q3 {
    public static void main(String[] args) {
        // Initialize variables
        Scanner k = new Scanner(System.in);
        int num, min = 0, max = 0, cnt = 0, sum = 0, sum1 = 0;
        double average, sd;
        String input;
        // Prompt user
        System.out.print("Enter a score [negative score to quit]:");
        num = k.nextInt();
        input = k.nextLine(); // flush the newline \n
        if (num < 0)
            System.exit(0); // Stops the program; no calculation
        else {
            cnt++;
            sum += num;
            sum1 += num*num;
            max = num;
            min = num;
        }
        // Repeat until input is negative
        while (num > 0) {
            System.out.print("Enter a score [negative score to quit]:");
            num = k.nextInt();
            input = k.nextLine();
            if (num < 0)
                break; // Break out of the loop
            else {
                cnt++;
                sum += num;
                sum1 += num*num;
                if (num > max)
                    max = num;
                if (num < min)
                    min = num;
            }
        }
        average = sum / cnt;
        sd = Math.sqrt( (sum1 - sum*sum/cnt) / (cnt - 1.0));
        System.out.println((sum1 - sum*sum/cnt) / (cnt - 1.0));
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f\n", average);
        System.out.printf("Standard Deviation: %.2f\n", sd);
        }

    }

