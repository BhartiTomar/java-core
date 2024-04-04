package javacore.com.learning.core.day2session1;

import java.util.Scanner;

public class D02P52 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the number of last vowels to count: ");
        int n = scanner.nextInt();

        String lastNVowels = countLastNVowels(input, n);

        if (lastNVowels != null) {
            System.out.println(lastNVowels);
        } else {
            System.out.println("Mismatch in Vowel Count");
        }
        
        scanner.close();
    }

    public static String countLastNVowels(String str, int n) {
        int count = 0;
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0 && count < n; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result.insert(0, ch); 
                count++;
            }
        }

        if (count == n) {
            return result.toString();
        } else {
            return null; 
        }
    }
}
