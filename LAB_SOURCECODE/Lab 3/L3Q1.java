/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fop_l3;
import java.util.Scanner;

public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare variables
        int num1, num2, answer;
        String input;
        char operand;
        Scanner k = new Scanner(System.in);
        // Prompt user
        System.out.print("Enter two integer number: ");
        num1 = k.nextInt();  // 30 5\n
        num2 = k.nextInt();
        input = k.nextLine(); // flush the newline 
        System.out.print("Enter the operand: ");
        input = k.nextLine();                    
        operand = input.charAt(0); // takes only tthe first character
        // Calculation
        if (operand == '+') {
            answer = num1 + num2;
        }
        else if (operand == '-') {
             answer = num1 - num2;
        }
        else if (operand == '*') {
             answer = num1 * num2;
        }
        else if (operand == '/')  {
             answer = num1 / num2;
        }
        else if (operand == '%'){
             answer = num1 % num2;
        }
        else {
            answer = 0;
        }
        System.out.println(num1 + " " + operand + " " + num2 + " = " + answer);

    }
    
}
