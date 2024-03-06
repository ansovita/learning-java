public class DataTypes {
    public static void main(String[] args) {
        //First comment

        /*
        Tra  ta ta ta ta ta ta
         */

        //Variables: int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxScore);

        //Variables: double
        double temperature = 3.4;
        double price = 999.99;
        System.out.println(temperature);
        System.out.println(price);

        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        //Casting
        int areaInteger = (int) area;
        System.out.println(area);
        System.out.println(areaInteger);
        System.out.println(Math.round(area));

        //Char
        char symbol = '$';
        System.out.println(symbol);

        //Exercise:
        char n = 78; //N
        System.out.println(n);

        char t = 84; //T
        System.out.println(t);
        char a = 65; //A
        System.out.println(a);
        System.out.println(t);
        char j = 74; //J
        System.out.println(j);
        System.out.println(a);
        System.out.println(n);
        System.out.println(a);

        //Boolean is / has
        boolean isRaining = false;
        boolean hasPassedExercise = true;
        boolean isSammer = false;
        System.out.println(isRaining);
        System.out.println(isSammer);
        System.out.println(hasPassedExercise);
    }
}
