/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l6;

public class L6Q2 {
    public static void main(String[] args) {
        int row = 5;
        System.out.println("Triangle");
        for (int i = 1; i <= row; i++) {
            multiPrint(row-i, ' '); // arithmetic progression: 4, 3, 2, 1
            multiPrint(2*i-1, '*'); // arithmetic progression: 1, 3, 5, 7, 9
            multiPrint(row-i, ' ');
            System.out.println();
        }
        // Diamond = Upper triangle + lower triangle
        System.out.println("\nDiamond");
        for (int i = 1; i <= row; i++) { // Upper triangle
            multiPrint(row-i, ' ');
            multiPrint(2*i-1, '*');
            multiPrint(row-i, ' ');
            System.out.println();
        }
        for (int i = row - 1; i >= 0; i--) { // Lower triangle
            multiPrint(row-i, ' ');
            multiPrint(2*i-1, '*');
            multiPrint(row-i, ' ');
            System.out.println();
        }
    }
    
    
    public static void multiPrint(int n, char c) {
        for(int i = 1; i <= n; i++)
            System.out.print(c);
    }

}
