/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l3;
import java.util.Random;

public class L3Q2 {
    public static void main(String[] args) {
        // Declare variables
        int num;
        final int MAX = 6;
        Random random = new Random();
        num = random.nextInt(MAX);
        System.out.print(num + " is ");
        // Switch case
        switch (num){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                 System.out.println("zero");
        }
    }
}
