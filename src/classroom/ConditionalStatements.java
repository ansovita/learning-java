package classroom;

import com.sun.source.tree.IfTree;

public class ConditionalStatements {

    public static void main(String[] args) {
        //'If' statenent

        /*
        if(condition)
        //Code to be executed if condition is true!
        }
         */

        if (true) {
            System.out.println("This code is executed!");
        }

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
        if (x > 12) {
            System.out.println("x is greater than 12");
        }

        boolean isSpring = false;
        if (!isSpring) {
            System.out.println("If is Spring!");
        }

        //IF-ELSE
        //Child: <=12 age;
        //Teenager: <= 13 & <=19;
        // Adult => 20 &<= 59;
        // Else: Senior;


        int age = 25;
        if (age <= 12) {
            System.out.println("This is child!");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("This is teenager");
        }
        else if (age >= 20 && age <= 59) {
            System.out.println("This is adult");
        }
        else {
            System.out.println("This is senior");
        }
        int number = 10;
        if (number == 0) {
            System.out.println("The number is equal 0");
        }
        else if (number < 0) {
            System.out.println("The number is negative");
        }
        else if (number >= 0) {
            System.out.println("The number is positive");
        }

        int time = 10;
        if (time <= 11) {
            System.out.println("Good morning!");
        } else if (time >= 12 && time <= 17) {
            System.out.println("Good afternoon!");
        } else if (time >= 18 && time <= 23) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Can't be");
        }
    }
}