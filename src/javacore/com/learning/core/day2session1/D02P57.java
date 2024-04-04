package javacore.com.learning.core.day2session1;

import java.util.*;

public class D02P57 {
    public static void main(String[] args) {
        String[] dictionary = {"abb", "abc", "xyz", "xyy"};
        String pattern = "foo";
        
        List<String> matchedStrings = findMatchingStrings(dictionary, pattern);

        for (String matchedString : matchedStrings) {
            System.out.print(matchedString + " ");
        }
    }

    public static List<String> findMatchingStrings(String[] dictionary, String pattern) {
        List<String> matchedStrings = new ArrayList<>();
        String patternHash = generateHash(pattern);
        
        for (String word : dictionary) {
            if (generateHash(word).equals(patternHash)) {
                matchedStrings.add(word);
            }
        }
        
        return matchedStrings;
    }

    private static String generateHash(String pattern) {
        Map<Character, Integer> charMap = new HashMap<>();
        StringBuilder hash = new StringBuilder();
        int count = 0;
        
        for (char ch : pattern.toCharArray()) {
            charMap.putIfAbsent(ch, count++);
            hash.append(charMap.get(ch));
        }
        
        return hash.toString();
    }
}