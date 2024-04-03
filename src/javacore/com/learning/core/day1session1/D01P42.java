package javacore.com.learning.core.day1session1;

public class D01P42 {
    public static void main(String[] args) {
        int[] A = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += A[i];
        }
        A[15] = sum;

        double average = (double) sum / 18;
        A[16] = (int) average;

        int smallest = A[0];
        for (int i = 1; i < 18; i++) {
            if (A[i] < smallest) {
                smallest = A[i];
            }
        }
        A[17] = smallest;

        for (int i = 0; i < 18; i++) {
            System.out.print(A[i] + " ");
        }
    }
}