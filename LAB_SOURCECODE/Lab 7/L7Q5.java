/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l7;
import java.io.*;

public class L7Q5 {
    public static void main(String[] args) {
         int cnt;
        try {
           // Read data from binary file
           ObjectInputStream inputStream = new ObjectInputStream (new FileInputStream("person.dat"));
           cnt = inputStream.readInt();
           // Arrays for storing name, gender, age
           String[] name = new String[cnt];
           char[] gender = new char[cnt];
           int[] age = new int[cnt];
           try {
               int i=0;
               while (true) {
                   name[i] = inputStream.readUTF();
                   age[i] = inputStream.readInt();
                   gender[i] = inputStream.readChar();
                   i++;
               }
            } catch (EOFException e) { }
           
            String tempName;
            int tempAge;
            char tempGender;
            // Sort data in ascending order
            for (int pass = 1; pass < name.length; pass++ )
                for (int j = 0; j < name.length - 1; j++ )
                    if (name[j].compareToIgnoreCase(name[j+1])> 0 ) {
                        tempName = name[j];
                        name[j] = name[j+1];
                        name[j+1] = tempName;
                        tempGender= gender[j];
                        gender[j] = gender[j+1];
                        gender[j+1] = tempGender;
                        tempAge = age[j];
                        age[j] = age[j+1];
                        age[j+1] = age[j];
                 }

            // Display
            for(int k = 0; k < name.length; k++) {
                System.out.print("Name: " + name[k] + " Age: " + age[k] + " Gender: ");
                if (gender[k]=='M')
                    System.out.println("Male");
                else
                    System.out.println("Female");
            }
           // Close
           inputStream.close();
        } catch (FileNotFoundException e) {
           System.out.println("File was not found");
        } catch (IOException e) {
                System.out.println("Problem with file output");
        }

    }
}
