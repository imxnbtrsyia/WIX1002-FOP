/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l5;
import java.util.Scanner;
import java.util.Random;

public class L5Q5 {
    public static void main(String[] args) {
        // Initialise
        Scanner k = new Scanner(System.in);
        Random r = new Random();
        int [] num = new int[20];
        int loop = 0;
        
        // Store number in array
        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i = 0; i < 20; i++) {
            num[i] = r.nextInt(0,101);
        }
        
        // Display array
        for (int i = 0; i < 20; i++) {
            if (i==19) { // When it reaches the last element, print only number
                System.out.print(num[i]);
            } else // If not, include ","
            System.out.print(num[i] + ", ");
        }
        
        System.out.println("\nArray in descending order");
        for (int pass = 1; pass < 20; pass++) { // Total pass is N - 1
            for (int i = 0; i < 20-1; i++) { // for when comparing num[18] and num[19] so that array is not out of bound
                if (num[i] < num[i+1]) { // Swap
                    int temp = num[i];
                    num[i] = num[i+1];
                    num[i+1] = temp;
                }
            }
        }
        
        // Display descending array
        for (int i = 0; i<20; i++) {
            if (i==19) {
                System.out.print(num[i]);
            } else 
            System.out.print(num[i] + ", ");
        }
        
        // Prompt user
        System.out.print("\nEnter a number to search: ");
        int searchKey = k.nextInt();
        
        // Linear search
        for (int i = 0; i < 20; i++) {
            if (num[i] == searchKey) {
                System.out.println(searchKey + " found");
                loop++;
                System.out.println("Linear Search - "+loop+" loop(s)");
                break;
            }
            loop++;
        }
        
        // Binary search (requires sort ascending)
        for (int pass = 1; pass < 20; pass++) {
            for (int i = 0; i < 20-1; i++) {
                if (num[i] > num[i+1]) {
                    int temp = num[i];
                    num[i] = num[i+1];
                    num[i+1] = temp;
                }
            }
        }
        // Reset loop
        loop = 0;
        // Store index of low, high and middle
        int low = 0, high = 20-1, middle; // high = 20-1 because the highest index is num[19]
        // Binary search
        while (low <= high){
            middle = (low + high)/2;
            if (num[middle] == searchKey) {
                System.out.println(searchKey + " found");
                loop++;
                System.out.println("Binary Search - "+loop+" loop(s)");
                break;
            } else if (searchKey < num[middle]) {
                high = middle - 1; 
            } else {
                low = middle + 1; 
            }
            loop++;
        }
    }
}
