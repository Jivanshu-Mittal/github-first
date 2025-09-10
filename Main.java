// Basic Java Learning Structure

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Welcome to Java Learning!");

        // Variable declaration and initialization
        int number = 10;
        double decimal = 3.14;
        String text = "Hello, Java!";

        // Output variables
        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimal);
        System.out.println("String: " + text);

        // Input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Control structure: if-else
        if (number > 5) {
            System.out.println("Number is greater than 5.");
        } else {
            System.out.println("Number is 5 or less.");
        }

        // Loop: for
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Array example
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array elements:");
        for (int n : numbers) {
            System.out.println(n);
        }

        // List example
        java.util.List<String> fruits = java.util.Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println("List of fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}