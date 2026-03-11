import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // =============================
        // UC1: Welcome Message
        // =============================
        System.out.println("=================================");
        System.out.println(" Welcome to Palindrome Checker App ");
        System.out.println("=================================");

        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Application Version : 1.0");

        System.out.println("---------------------------------");
        System.out.println("Application Started Successfully");
        System.out.println("---------------------------------");

        // =============================
        // UC2: Hardcoded Palindrome Check
        // =============================
        String hardcodedWord = "madam";  // hardcoded word
        String reversedHardcoded = "";

        for (int i = hardcodedWord.length() - 1; i >= 0; i--) {
            reversedHardcoded += hardcodedWord.charAt(i);
        }

        if (hardcodedWord.equalsIgnoreCase(reversedHardcoded)) {
            System.out.println("UC2 Result: \"" + hardcodedWord + "\" is a palindrome!");
        } else {
            System.out.println("UC2 Result: \"" + hardcodedWord + "\" is NOT a palindrome.");
        }

        // =============================
        // UC3: Palindrome Check Using String Reverse
        // =============================
        Scanner sc = new Scanner(System.in);
        System.out.print("UC3: Enter a word to check palindrome: ");
        String input = sc.nextLine();

        String reversedInput = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput += input.charAt(i);
        }

        if (input.equalsIgnoreCase(reversedInput)) {
            System.out.println("UC3 Result: \"" + input + "\" is a palindrome!");
        } else {
            System.out.println("UC3 Result: \"" + input + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}