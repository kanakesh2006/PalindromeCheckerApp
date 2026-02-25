// UseCase2PalindromeCheckerApp.java

// Class acts as container for program logic
public class UseCase2PalindromeCheckerApp {

    // Main method - entry point of Java application
    public static void main(String[] args) {

        // Hardcoded string literal
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome using if-else condition
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Program exit message
        System.out.println("Program executed successfully.");
    }
}