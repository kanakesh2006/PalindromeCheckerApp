public class PalindromeCheckerApp {

    // ===== UC1: Application Entry & Welcome Message =====
    public static void displayWelcomeMessage() {
        System.out.println("====================================");
        System.out.println("   Welcome to Palindrome Checker   ");
        System.out.println("====================================");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Application Version : v1.0");
        System.out.println();
    }

    // ===== UC2: Print a Hardcoded Palindrome Result =====
    public static void checkHardcodedPalindrome() {
        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equals(reversed);
        System.out.println("UC2 → Is it a palindrome? " + isPalindrome);
        System.out.println();
    }

    // ===== UC3: Palindrome Check Using String Reverse =====
    public static void checkPalindromeUsingStringReverse() {
        String original = "madam";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        boolean isPalindrome = original.equals(reversed);

        System.out.println("UC3 → Original String: " + original);
        System.out.println("UC3 → Reversed String: " + reversed);
        System.out.println("UC3 → Is it a palindrome? " + isPalindrome);
        System.out.println();
    }

}