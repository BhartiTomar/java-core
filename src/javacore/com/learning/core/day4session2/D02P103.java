package javacore.com.learning.core.day4session2;

import java.util.Scanner;

public class D02P103 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Input the number of elements in the array
        int n = scanner.nextInt();
        
        // Input the arrays
        int[][] arrays = new int[n][];
        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            arrays[i] = new int[size];
            for (int j = 0; j < size; j++) {
                arrays[i][j] = scanner.nextInt();
            }
        }
        
        // Input the element to search for
        int target = scanner.nextInt();
        
        // Perform linear search for each array
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] == target) {
                    found = true;
                    break;
                }
            }
            // Output the result
            if (found) {
                System.out.println("Element is Present");
            } else {
                System.out.println("Element is not Present");
            }
        }
        
        scanner.close();
    }
}