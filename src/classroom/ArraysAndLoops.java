package classroom;

import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {

        //Array
        //Bread; Milk; Eggs; Fruits;

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};

        String eggs = shoppingList[2];
        System.out.println(eggs);

        int[] grades = {7, 9, 10, 6, 5, 4};
        System.out.println(grades[4]);
        System.out.println(grades[0]);

        grades[0] = 2;
        System.out.println(grades[0]);

        // Print all grades
        System.out.println(Arrays.toString(grades));

        //Create empty array;
        int[] emptyArray = new int[4];
        //[0] [0] [0] [0]
        System.out.println(Arrays.toString(emptyArray));

        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3] = 4;
        System.out.println(Arrays.toString(emptyArray));

        // Create String array with names;
        // Name count should be 5;
        // And print them all;
        String[] names = {"Tatjana", "Aleks", "Mark", "Daniel", "Stas"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        // Create empty double array with size of 5;
        // Print empty array
        // Update each array value from 0 to a number of your choice;
        // Print them all

        double[] empty = new double[5];
        System.out.println(Arrays.toString(empty));

        empty[0] = 3.14;
        empty[1] = 5.50;
        empty[2] = 1.11;
        empty[3] = 6.66;
        empty[4] = 5.35;
        System.out.println(Arrays.toString(empty));

        //Print numbers from 10 to 0;
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        //Calculate sum from 0 to 100;
        //Example: 1 + 2 + 3 + 4 + ...;
        int summa = 0;
        for (int i = 1; i <= 100; i++) {
            summa = summa + i;
        }
        System.out.println("Sum: " + summa);

        //for ->
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }
        //i = 0; (counter)
        //check: if i < shoppingList.length (4);
        //i = i + 1;

        //1 iteration: System.out.println(shoppingList[0]);
        //Print: Bread
        //i = 1

        //2 iteration: System.out.println(shoppingList[1]);
        //Print: Milk
        //i = 2

        //3 iteration: System.out.println(shoppingList[2]);
        //Print: Eggs
        //i = 3

        //3 iteration: System.out.println(shoppingList[3]);
        //Print: Fruits
        //i = 4

        for (String s : shoppingList) {
            System.out.println(s);
        }

        /*
        while loop:
        while (condition) {
        code to be executed
        }
         */
        int i = 0;
        while (i < shoppingList.length) {
            System.out.println("Buy " + shoppingList[i]);
            i++;
        }
        int counter = 10;
        while (counter >=0) {
            System.out.println(counter);
            counter--;
        }
    }
}