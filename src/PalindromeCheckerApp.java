import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

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

    // ===== UC4: Character Array Based Palindrome Check =====
    public static void checkPalindromeUsingCharArray() {
        String word = "madam";
        char[] characters = word.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("UC4 → Is it a palindrome? " + isPalindrome);
        System.out.println();
    }

    // ===== UC5: Stack-Based Palindrome Checker =====
    public static void checkPalindromeUsingStack() {
        String word = "madam";
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC5 → Is it a palindrome? " + isPalindrome);
        System.out.println();
    }

    // ===== UC6: Queue + Stack Based Palindrome Check =====
    public static void checkPalindromeUsingQueueAndStack() {
        String word = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and push characters
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC6 → Is it a palindrome? " + isPalindrome);
        System.out.println();
    }

    // ===== UC7: Deque-Based Optimized Palindrome Checker =====
    public static void checkPalindromeUsingDeque() {
        String word = "madam";
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Remove first and last and compare
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC7 → Is it a palindrome? " + isPalindrome);
        System.out.println();
    }


    // ===== Main Method =====
    public static void main(String[] args) {

        displayWelcomeMessage();          // UC1
        checkHardcodedPalindrome();       // UC2
        checkPalindromeUsingStringReverse(); // UC3
        checkPalindromeUsingCharArray();  // UC4
        checkPalindromeUsingStack();      // UC5
        checkPalindromeUsingQueueAndStack(); // UC6
        checkPalindromeUsingDeque();      // UC7
    }

}