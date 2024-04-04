package javacore.com.learning.core.day1session2;

import java.util.HashMap;
import java.util.Scanner;
 
public class D01P43 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        int resultIndex = findFirstRepeatingIndex(arr);
        System.out.println(resultIndex == -1 ? "No repeating element found." : "Index of first repeating element: " + resultIndex);
    }
    public static int findFirstRepeatingIndex(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
 
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                minIndex = Math.min(minIndex, map.get(arr[i]));
            } else {
                map.put(arr[i], i);
            }
        }
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
 

}