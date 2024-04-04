package javacore.com.learning.core.day2session1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D02P53 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
   	    System.out.print("Enter the input string:");
        String input = scan.next();
        List<String> subsequences = getAllSubsequences(input);

        for (String subsequence : subsequences) {
            System.out.print(subsequence +",");
        }
    }

    public static List<String> getAllSubsequences(String str) {
        List<String> subsequences = new ArrayList<>();
        generateSubsequences(str, 0, "", subsequences);
        return subsequences;
    }

    private static void generateSubsequences(String input, int index, String current, List<String> subsequences) {
        if (index == input.length()) {
            subsequences.add(current);
            return;
        }

        generateSubsequences(input, index + 1, current + input.charAt(index), subsequences);

        generateSubsequences(input, index + 1, current, subsequences);
    }
}