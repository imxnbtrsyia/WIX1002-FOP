package lab4;

import java.util.Scanner;
public class L4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int integer = sc.nextInt();
//        int i=1;
        String answer = "";
        System.out.print("The factors are: ");
//        while(i<=integer){
//            if(integer%i==0)
//                answer += i + ", ";
//            i++;
//        }

        for(int i=1; i<=integer;i++){
            if(integer%i==0)
                answer += i +", ";
        }
        System.out.println(answer.substring(0,answer.length()-2));
    }
}