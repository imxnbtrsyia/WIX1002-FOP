/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l4;
import java.util.Random;

public class L4Q5 {
    public static void main(String[] args) {
        // Initialize variables
        int player1 = 0, player2 = 0, dice;
        final int MAX = 7;
        Random g = new Random();
        game:{
        for(int i = 0; ; i++) { // No conditions; game repeats
            if (i%2==0) {
                do {
                    // Randomize dice
                    dice = g.nextInt(1, MAX);
                    // Summation
                    player1 += dice;
                    System.out.println("Player 1 - Roll Dice: " + dice + " Total: " + player1);
                    if (player1 > 100) {
                        System.out.println("Player 1 WIN!");
                        break game; // Game ends
                    }
                } while(dice==6);
            }
            else {
                do {
                    // Randomize dice
                    dice = g.nextInt(1, MAX);
                    // Summation
                    player2 += dice;
                    System.out.println("Player 2 - Roll Dice: " + dice + " Total: " + player2);
                    if (player2 > 100) {
                        System.out.println("Player 2 WIN!");
                        break game; // Game ends
                    }
                } while(dice==6);
                }
            }
        }
    }
}
