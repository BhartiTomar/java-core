package javacore.com.learning.core.day1session2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class D01P44 {
    public static List<String> findCombinations(String str, int k) {
        List<String> result = new ArrayList<>();
        generateCombinations(str, k, 0, new StringBuilder(), result);
        return result;
    }
 
    private static void generateCombinations(String str, int k, int index, StringBuilder current, List<String> result) {
        if (current.length() == k) {
            result.add(current.toString());
            return;
        }
 
        for (int i = index; i < str.length(); i++) {
            current.append(str.charAt(i));
            generateCombinations(str, k, i + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
 
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Input array: ");
        String array = scanner.nextLine();
        System.out.print("Input K: ");
        int k = scanner.nextInt();
 
        List<String> combinations = findCombinations(array, k);
 
        System.out.println("Output:");
        for (String combination : combinations) {
            System.out.print(combination);
            if (combinations.indexOf(combination) != combinations.size() - 1) {
                System.out.print(",");
            }
        }
    }
}