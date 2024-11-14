/*Accept a string input from the user and check if it’s a palindrome (a word
that reads the same forwards and backwards). Create a method to
reverse the string and compare it to the original to determine if it’s a
palindrome.*/ 
import java.util.Scanner;

public class palindromechecker {
      // Method to reverse a string
      public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversedStr = reverseString(str);
        return str.equalsIgnoreCase(reversedStr); // Ignores case differences
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string that you want to check that the word is palindrome or not");
        String input = sc.nextLine();
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
