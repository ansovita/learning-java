package classroom;

import java.util.Random;
import java.util.Scanner;

public class Asker {
    public static void main(String[] args) {

        //Scanner ->
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your name?");
        String answer = reader.nextLine();
        System.out.println("Your name is: " + answer);
        if(answer.equals("John")) {
            System.out.println("John is not allowed here!");
        } else {
            System.out.println("Welcome: " + answer);
        }

        //Random scanner ->
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(10) + 1;
        System.out.println("Guess the right number from 1 to 10");
        int answerN = input.nextInt();
        if (number == answerN) {
            System.out.println("You guessed the number!");
        } else {
            System.out.println("Incorrect guess, Number was: " + number);
        }

    }
}
