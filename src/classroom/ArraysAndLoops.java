package classroom;

import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {

        //Array
        //Bread; Milk; Eggs; Fruits;

        String[] shoppingList = {"Btread", "Milk", "Eggs", "Fruits"};

        int[] grades = {7, 9, 10, 6, 5, 4};

        String[] seasons = {"Summer", "Winter", "Autumn", "Spring"};

        String eggs = shoppingList[2];
        System.out.println(eggs);

        System.out.println(grades[0]);

        //Create empty array;
        int[] emptyArray = new int[4];
        //[0] [0] [0] [0]
        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3] = 4;
        System.out.println(Arrays.toString(emptyArray));

//      // Create String array with names;
        // Name count should be 5;
        // And print them all;

        String[] names = {"Tatjana", "Aleks", "Mark", "Daniel", "Stas"}; {
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        }

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

        //Print number from 0 to 10;

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int counter = 10;
        while (counter >= 0) ;
        System.out.println(counter --);

        //Print number from 2 to 100;
        for (int i = 2; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
