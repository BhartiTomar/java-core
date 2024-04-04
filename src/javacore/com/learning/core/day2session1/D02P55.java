package javacore.com.learning.core.day2session1;

import java.util.*;

public class D02P55 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter the strings separated by space:");
        String[] strings = scanner.nextLine().split(" ");

        boolean result = canFormCircle(strings);

        if (result) {
            System.out.println("Yes");
            System.out.println(String.join(" ", strings));
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }

    public static boolean canFormCircle(String[] strings) {
  
        Map<Character, Integer> firstCharFreq = new HashMap<>();
        Map<Character, Integer> lastCharFreq = new HashMap<>();

        for (String str : strings) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            firstCharFreq.put(firstChar, firstCharFreq.getOrDefault(firstChar, 0) + 1);
            lastCharFreq.put(lastChar, lastCharFreq.getOrDefault(lastChar, 0) + 1);
        }

        for (char lastChar : lastCharFreq.keySet()) {
            if (!firstCharFreq.containsKey(lastChar) || !firstCharFreq.get(lastChar).equals(lastCharFreq.get(lastChar))) {
                return false;
            }
        }
        
        return true;
    }
}