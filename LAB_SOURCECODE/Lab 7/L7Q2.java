/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l7;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class L7Q2 {
    public static void main(String[] args) {
        
        try {
            // Store URL link
            URL u = new URL("https://fsktm.um.edu.my/");
            // Open connection to URL
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            // Read data from website
            Scanner in = new Scanner(stream);
            // Write to a file
            PrintWriter out = new PrintWriter(new FileOutputStream("index.htm"));
            while (in.hasNextLine()){
                out.println(in.nextLine());
            }
            out.close();
            in.close();
        }
        catch (IOException e) { // Input/Output Exception
            System.out.println("IO Error:" + e.getMessage());
        }
    
    }
}
