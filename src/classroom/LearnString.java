package classroom;

import java.util.Locale;

public class LearnString {
    public static void main(String[] args) {

        // String
        String name = "Nikita";
        String lastName = "Milka";

        System.out.println(name);
        System.out.println(lastName);

        // Exercise: Print name and surname (Example: John Doe);
        // Concatenation
        String fullName = name + " " + lastName; // Nikita Milka
        System.out.println(fullName);

        // Same example
        System.out.println(fullName + " " + lastName);

        String.format("%s %s", name, lastName);

//        //Can save into variable
//        String myFullName =

//       // Hello, world!
//        String hello = "Hello, ";
//        String world = "world!";

//        String helloWorld = hello.concat(world);
//        System.out.println(helloWorld);
//
//        String randomString = "some text";
//        System.out.println(randomString.toUpperCase());



    }
}
