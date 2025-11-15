/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l4;
import java.util.Scanner;

public class L4Q7 {
    public static void main(String[] args) {
        // Declare variables
        String input;
        double principal, monthlyPayment, interest, principalDue, interestDue, principalBalance, totalInterest = 0;
        int totalMonth, totalMonthPay = 1;
        Scanner k = new Scanner(System.in);
        // Prompt user
        System.out.print("Enter principal amount: ");
        principal = k.nextDouble();
        input = k.nextLine();
        System.out.print("Enter interest in %: ");
        interest = k.nextDouble();
        input = k.nextLine();
        System.out.print("Enter total number of month(s): ");
        totalMonth = k.nextInt();
        input = k.nextLine();
        // Calculation
        monthlyPayment = (principal * interest / 1200) / (1 - Math.pow(1+interest/1200, -1*totalMonth));
        //System.out.printf("Monthly paymenet is %.2f", monthlyPayment);
            
        System.out.println("Month\tMonthly Payment\tPrincipal\tInterest\tUnpaid Balance\tTotal Interest");
        for(int i = 1; i <= totalMonth; i++) {
            // Calculation
            principalDue = monthlyPayment * Math.pow(1+interest/1200, -1 * (1+totalMonth-i));
            interestDue = monthlyPayment - principalDue;
            totalInterest+=interestDue;
            principalBalance = interestDue*1200/interest - principalDue;
            // Format output following table
            System.out.printf("%-5d\t%15.2f\t%9.2f\t",i, monthlyPayment, principalDue);
            System.out.printf("%8.2f\t%14.2f\t%14.2f\n", interestDue, principalBalance,totalInterest);
        }

    }
   
}
