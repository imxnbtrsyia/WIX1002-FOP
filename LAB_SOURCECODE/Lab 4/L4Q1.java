/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fop_l4;
import java.util.Scanner;

public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare variable
        int num;
        // Prompt user
        System.out.print("Enter an Integer: ");
        Scanner k = new Scanner(System.in);
        // User input
        num = k.nextInt();
        System.out.print("The factors are: ");
        for(int i = 1; i <= num; i++)
            if (num % i== 0)
                if (num == i)
                 System.out.println(num);
                else
                     System.out.print(i + ", ");
    }
    
}
