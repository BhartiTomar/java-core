package javacore.com.learning.core.day2session1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class D02P58 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        
        boolean canSplit = checkSplitIntoFourStrings(input);
        
        if (canSplit) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
    
    public static boolean checkSplitIntoFourStrings(String str) {

        if (str.length() % 4 != 0) {
            return false;
        }

    	
        Set<Character> charSet = new HashSet<>();
        
        for (char ch : str.toCharArray()) {
            charSet.add(ch);
        }

        return charSet.size() <= 4;

    }
}