package lab2;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        float Q = 0, M,initial,finalTemp,celtempInit, celtempFinal, celTemp;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        M = keyboard.nextFloat();
        System.out.print("Enter the init temp of water in F: ");
        initial = keyboard.nextFloat();
        System.out.print("Enter the final temp of water in F: ");
        finalTemp = keyboard.nextFloat();

        M=M/1000;
        celtempInit = (initial-32)/1.8f;
        celtempFinal =  (finalTemp-32)/1.8F;
        celTemp = celtempFinal-celtempInit;
        Q=M*(celTemp)*4184;
        System.out.printf("The energy needed is %e" , Q);

        // C = (F-32) * 9 / 5;


    }
}
