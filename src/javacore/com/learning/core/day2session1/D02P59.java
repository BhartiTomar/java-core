package javacore.com.learning.core.day2session1;

import java.util.Scanner;

public class D02P59 {
    public static void main(String[] args) {

        String input = "Mr John Smith";
        String replacedString = replaceSpaces(input);
        System.out.println("Output: " + replacedString);
    }
 
    public static String replaceSpaces(String str) {

        StringBuilder sb = new StringBuilder();
 
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                sb.append("%20");
            } else {
                sb.append(ch);
            }
        }
 
        return sb.toString();
    }
}
