package javacore.com.learning.core.day1session1;

import java.util.Scanner;

public class D01P32 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 to 7: ");
        int weekNumber = scanner.nextInt();

        if (weekNumber >= 1 && weekNumber <= 7) {
            String weekday = getWeekday(weekNumber);
            System.out.println(weekday);
        } else {
            System.out.println("Invalid Input");
        }
 
        scanner.close();
    }

    public static String getWeekday(int weekNumber) {
        switch (weekNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid Input";
        }
    }
}