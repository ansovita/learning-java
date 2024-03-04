public class DataTypes {
    public static void main(String[] args) {
        //First comment
          /* Hello World
        I am working on this file
        Please do not hesitate to ask me
        If you have a questions!
         */

        // Variables: int
        int numberOfStudents = 30;
        int maxStore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxStore);

        //Variables: double
        double temperature = 3.4;
        double price = 999.99;
        System.out.println(temperature);
        System.out.println(price);

        //Variables: float
        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        //Casting
        int areaInteger = (int) area;
        System.out.println(Math.round(area));

        //Char
        char symbol = '$';
    }
}
