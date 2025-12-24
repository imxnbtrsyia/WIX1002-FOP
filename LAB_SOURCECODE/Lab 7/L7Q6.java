/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l7;
import java.util.*;
import java.io.*;

public class L7Q6 {
    public static void main(String[] args) {
        try {
            System.out.println("ProductID\tProductName\tQuantity\tPricePerUnit\tTotal");
            // Read data from order.txt
            Scanner input1 = new Scanner(new FileInputStream("order.txt"));
            // Initialize
            String[] order, product;
            String temp, productName="";
            int quantity = 0;
            double price = 0;
            // Store order data
            while (input1.hasNextLine()) {
                temp = input1.nextLine();
                order = temp.split(","); // comma-separated value
                quantity = Integer.parseInt(order[2]);
                // Read data from product.txt
                Scanner input2 = new Scanner(new FileInputStream("product.txt"));
                // Store product data
                while (input2.hasNextLine()) {
                    temp = input2.nextLine();
                    product = temp.split(","); // comma-separated value
                    if (order[1].equals(product[0])) {
                        productName = product[1];
                        price = Double.parseDouble(product[2]);
                        break;
                    }
                }
            // Close
            input2.close();
            System.out.printf("%-10s%-20s", order[1], productName);
            System.out.printf("\t%-10d\t%6.2f\t%7.2f\n", quantity, price , quantity*price);
        }
        input1.close();
    } catch (FileNotFoundException e) {
        System.out.println("File was not found");
    }

    }
}
