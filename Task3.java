package Lab5;

import java.util.Scanner;

public class Task3 {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        // Removing non-alphanumeric characters and converting to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Two pointers approach to check if the string is a palindrome
        int left = 0;
        int right = cleanInput.length() - 1;
        
        while (left < right) {
            if (cleanInput.charAt(left) != cleanInput.charAt(right)) {
                return false; // If characters at the two pointers don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If the loop completes without returning false, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Checking if the input string is a palindrome
        if (isPalindrome(userInput)) {
            System.out.println("'" + userInput + "' is a palindrome.");
        } else {
            System.out.println("'" + userInput + "' is not a palindrome.");
        }
        
        scanner.close();
    }
}
