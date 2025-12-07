/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l5;


public class L5Q4 {
    public static void main(String[] args) {
        // Initialize
        final int ROW = 3;
        int[][] matrix = { {1, 5, 7}, 
                           {3, 6, 9}, 
                           {5, 3, 8} };
        
        // Display matrix
        System.out.println("3 by 3 Matrix");
        for(int i = 0; i < ROW; i++) {
            for(int j = 0; j < ROW; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
        
        // Transpose
        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j<3; j++) { //j=i+1 to avoid swapping kali kedua between arr[i][j]->arr[j][i]
                if (i!=j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
                }
            }
        }
        
        // Swap columns 1 and 3
        for (int i = 0; i < 3; i++) {
            int temp = matrix[i][0];
            matrix[i][0]=matrix[i][2];
            matrix[i][2]=temp;
        }
        
        System.out.println();
        // Display matrix
        System.out.println("After rotates 90 degrees clockwise");
        for (int i = 0; i < 3;i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
