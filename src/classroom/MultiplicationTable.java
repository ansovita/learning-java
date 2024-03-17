package classroom;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner((System.in));
        System.out.println("Enter a number");
        int answer = myScanner.nextInt(4);

        System.out.println("This is multiplication table for number: " + answer);
        for (int i = 1; i <= 10; i++) {
            int result = answer * 1;
            System.out.println(String.format("%d * %d = %d", answer, 1, result));
        }
        //Exercise: Print even numbers from 2 to 100;
        //Print in one line all the numbers;
        for (int i = 0; i <= 100; i = i + 2) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

