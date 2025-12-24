/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fop_l7;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.EOFException
        ;
public class L7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Store arrays for course code and name
        String[] code = {"WXES1116","WXES1115","WXES1110","WXES1112"};
        String[] name = {"Programming I","Data Structure","Operating System","Computing Mathematics I"};
        try {
            // Write data to a file in binary
            ObjectOutputStream outputStream = new ObjectOutputStream (new FileOutputStream("coursename.dat"));            
            for(int i=0; i< code.length; i++) {
               outputStream.writeUTF(code[i]);
               outputStream.writeUTF(name[i]);
            }           
            // Close
            outputStream.close();
        } catch (IOException e) { // Input/Output Exception
           System.out.println("Problem with file output.");
        }
        // Used for checking course
        boolean status = false;
        Scanner k = new Scanner(System.in);
        // Prompt user
        System.out.print("Please enter course code:");
        String input = k.nextLine();

         try { 
             // Read data from a file
            ObjectInputStream inputStream = new ObjectInputStream (new FileInputStream("coursename.dat"));
            try {
                while (true) {
                    // .readUTF reads a String
                     if (input.equals(inputStream.readUTF())) {
                         System.out.println("Course Code: " + input);
                         System.out.println("Course Name: " + inputStream.readUTF());
                         status = true;
                         break;
                     }
                     else
                         // Skips the next String in the line (Course name)
                         inputStream.readUTF();  
                }
            } catch (EOFException e) { } // End of File exception 
            inputStream.close();
         } catch (FileNotFoundException e) {
            System.out.println("File was not found");
         } catch (IOException e) {
                 System.out.println("Problem with file input");
         }
          if (!status)              
              System.out.println("The course " + input + " is not available");

    }
    
}
