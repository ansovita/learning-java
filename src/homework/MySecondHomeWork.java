package homework;

public class MySecondHomeWork {
    public static void main(String[] args) {

        //Print positive values;
        for (int i = 5; i >= 0; i--) {
            if (i > 0) {
                System.out.println(i + "-" + "Positive value");
            }
        }
        //Print even number from 0 to 20;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " " + "Even number");
            }
        }
        //Teenager < 18; Adult => 19;
        for (int i = 12; i <= 25; i++) {
            if (i < 18) {
                System.out.println("Teenager");
            }
            if (i >= 19) {
                System.out.println("Adult");
            }
        }
        //Leap year;
        for (int i = 2010; i <= 2030; i++) {
            if (i % 4 != 0) {
                System.out.println(i + " " + "Not leap year");
            }
            if (i % 4 == 0) {
                System.out.println(i + " " + "Leap year");
            }
        }
        //Multiple conditions:
        for (int a = 90; a < 100; a++) {
            if (a > 90) {
                if (a % 2 == 0)
                    System.out.println(a + " " + "-" + " " + "Valid number");
            }
        }
        //Nested conditions:
        for (int a = 5; a <= 10; a++) {
            if (a > 5) {
                if (a % 2 == 0)
                    System.out.println(a + " " + "-" + " " + "Positive and Even");
            }
        }
        //BMI calculator:
            int weight = 75;
            float height = 1.67f;
        {
                    System.out.println(weight / (height * height));
        }
        //Calculation of the final grade
        int m = 90; //Math score
        int s = 85; //Science
        int e = 80; //English
        int x = (m + s + e)/3; { //Average value
            if (x >= 90 && x <= 100) {
                System.out.println("A");
            }
            else if (x >= 80 && x <= 89) {
                System.out.println("B");
            }
            else if (x >= 70 && x <= 79) {
                System.out.println("C");
            }
            else if (x >= 60 && x <= 69) {
                System.out.println("D");
            }
            else if (x <= 60) {
                System.out.println("F");
            }
        }
    }
}