package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class L5Q2ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random r = new Random();
        for (int i=0;i<10;){
            int n = r.nextInt(21);
            if (!numbers.contains(n)){
                numbers.add(n);
                i++;
            }
        }

        System.out.println(numbers);

        Collections.sort(numbers,Collections.reverseOrder());

        System.out.println(numbers);
    }
}
