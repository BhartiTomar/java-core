package javacore.com.learning.core.day2session1;

import java.util.Scanner;

public class D02P54 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter the input string:");
        String str = scan.next();
         
        int deletions = minDeletionsForPalindrome(str);
        System.out.println("Minimum number of deletions to make the string palindrome: " + deletions);
    }

    public static int minDeletionsForPalindrome(String str) {
 
        int longestPalindromicSubsequenceLength = longestPalindromicSubsequenceLength(str);
        return str.length() - longestPalindromicSubsequenceLength;
    }

    public static int longestPalindromicSubsequenceLength(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int len = 2; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                int end = start + len - 1;
                if (str.charAt(start) == str.charAt(end)) {
                    dp[start][end] = 2 + dp[start + 1][end - 1];
                } else {
                    dp[start][end] = Math.max(dp[start + 1][end], dp[start][end - 1]);
                }
            }
        }

        return dp[0][n - 1];
    }
}