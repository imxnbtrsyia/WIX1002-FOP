/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l7;
import java.util.*;
import java.io.*;

public class L7Q4 {
    public static void main(String[] args) {
        try {
            // Initialize
            String input;
            int line = 0, character = 0, word = 0, cnt;
            Scanner inputStream = new Scanner(new FileInputStream("data.txt"));
            // Count lines, characters, words
            while (inputStream.hasNextLine()) {
                // Store the line in txt file in input
                input = inputStream.nextLine();
                // Increase number of line
                line++;
                // Sum total of characters
                character+=input.length();
                // Sum total words
                int i=0;
                // Handle space to count words
                while(i!=-1) {
                    i = input.indexOf(" ", i);
                    if (i!=-1)
                        i = i+1;
                    word++;
                }        
            }
            // Close
            inputStream.close();
            // Display
            System.out.println("Number of line(s) in the text file: " + line);
            System.out.println("Number of word(s) in the text file: " + word);
            System.out.println("Number of characters(s) in the text file: " + character);
        } catch (FileNotFoundException e) {
           System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }

    }
}
