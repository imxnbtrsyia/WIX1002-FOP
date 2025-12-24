/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l6;


public class L6Q6 {
    public static void main(String[] args) {
        int N = 20;
        System.out.println("The first " + N + " palindromic prime");
        for(int i = 1, j = 1; i <= N; j++) { // i - total prime numbers; j - palindrome number   
                if (isPalindromePrime(j)) {                
                    System.out.print(j + " ");
                    i++;
                }
        }                
        System.out.println("");
        System.out.println("The first " + N + " emirp");
            for(int i=1, j=1; i<=N; j++) {        
                if (isEmirp(j)) {                
                    System.out.print(j + " ");
                    i++;
                }
        }  
        System.out.println("");
        }

        public static boolean isPrime(int n) {
            if (n==2)
                return true;
            else if (n<2 || n%2==0)
                return false;
            else {
                for(int i=3; i<n/2; i+=2)
                    if (n%i==0)
                        return false;
            }
            return true;
        }

        public static int reverseDigit(int a) {
            int b = 0;
            while (a > 0) {
                b = b*10 + a%10;
                a /= 10;
            }    
            return b;            
        }

        public static boolean isPalindrome(int a) {
            int original = a;
            int reversed = reverseDigit(a);

            if (original == reversed)
                return true;
            else
                return false;
        }

        public static boolean isPalindromePrime(int a) {
            return (isPrime(a) && isPalindrome(a));
        }

        public static boolean isEmirp(int a) {
            int reversed = reverseDigit(a);
            return (isPrime(a) && isPrime(reversed) && !isPalindromePrime(a));
        }
}
