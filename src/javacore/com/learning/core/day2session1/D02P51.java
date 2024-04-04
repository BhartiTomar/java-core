package javacore.com.learning.core.day2session1;

import java.util.Scanner;

public class D02P51 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Length of the string: " + input.length());

        String uppercaseString = input.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);
        
        boolean isPalindrome = checkPalindrome(input);
        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome.");
        }
        
        scanner.close();
    }
    
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}