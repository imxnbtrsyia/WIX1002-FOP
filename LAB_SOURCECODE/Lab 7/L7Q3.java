/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l7;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L7Q3 {
    public static void main(String[] args) {
        try {
            // Write to diary.txt
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("diary.txt"));
            outputStream.println("12 December 2024");
            outputStream.println("I am doing Lab 7 Question 3.");
            // Close
            outputStream.close();
        }catch(IOException e){ // Input/Output Exception
            System.out.println("Problem with the file output.");
        }
        
        try {
            // Read diary.txt
            Scanner inputStream = new Scanner(new FileInputStream("diary.txt"));
            // Write to reverse.txt
            PrintWriter outputStream2 = new PrintWriter(new FileOutputStream("reverse.txt"));
            // Read lines and String handling
            while (inputStream.hasNextLine()){
                // Store the first line in diary.txt in variable line
                String line = inputStream.nextLine();
                // Reverse String
                for (int i = line.length()-1; i>=0; i--)
                    // Write to reverse.txt per character and \n
                    outputStream2.print(line.charAt(i));
                outputStream2.print("\n");
            }
            // Close
            outputStream2.close();
            inputStream.close();
        } catch (FileNotFoundException e){
            System.out.println("File is not found");
        }
    }
}
