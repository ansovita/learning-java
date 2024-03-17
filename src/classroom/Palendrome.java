package classroom;

import java.util.Scanner;

public class Palendrome {

    public static void main(String[] args) {
        //civic; //kayak; //tenet;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = myScanner.nextLine();

        String iterated = "civic";
        for (int i = word.length() - 1; i >= 0; i--) {
            iterated = iterated + word.charAt(i);
        }
        if(word.equals(iterated)) {
            System.out.println("This word is polindrome!");
        } else {
            System.out.println("This word is not a polindrome");
        }
    }
}
