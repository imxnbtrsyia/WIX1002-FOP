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
public class L2Q5 {
    public static void main(String[] args) {
        // Declare variables
        int num, sum = 0;
        final int MAX = 10001;
        Random r = new Random();
        // Randomize: 8453
        num = r.nextInt(MAX);
        System.out.printf("The number is %5d\n", num);
        // Calculation
        sum += num/10000; // 0
        num %=10000; // 8453
        sum += num/1000; // 0+8= 8
        num %=1000; // 453
        sum += num/100; // 8 + 4 = 12
        num %=100; // 53
        sum += num/10; // 12+5 = 17
        num %=10; // 3
        sum +=num; // 17 +3 = 20
        System.out.printf("The sum of the digit is %2d\n", sum);
        
    }
}
