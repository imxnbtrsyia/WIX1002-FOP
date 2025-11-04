/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l3;
import java.util.Random;

public class L3Q4 {
    public static void main(String[] args) {
        // Declare variables
        int player1, player2;
        final int MAX = 7;
        Random g = new Random();
        // Randomize scores
        player1 = g.nextInt(1,MAX) + g.nextInt(1,MAX);
        player2 = g.nextInt(1,MAX) + g.nextInt(1,MAX);
        // Display scores
        System.out.println("Player 1 Score: "+ player1);
        System.out.println("Player 2 Score: "+ player2);
        if (player1 > player2) {
            System.out.println("Player 1 WIN!");
        }
        else if (player2 > player1) {
            System.out.println("Player 2 WIN!");
        }
        else {
            System.out.println("The game is TIE!");
        }
    }
}
