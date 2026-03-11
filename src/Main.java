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
        String word = "madam";  // hardcoded word
        String reversed = "";

        // Reverse the word
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Check palindrome
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("UC2 Result: \"" + word + "\" is a palindrome!");
        } else {
            System.out.println("UC2 Result: \"" + word + "\" is NOT a palindrome.");
        }
    }
}