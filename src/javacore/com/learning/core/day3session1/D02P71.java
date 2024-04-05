package javacore.com.learning.core.day3session1;

import java.util.ArrayList;
import java.util.Scanner;
 
public class D02P71 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the list of student names separated by spaces:");
        String inputNames = scanner.nextLine();

        String[] namesArray = inputNames.split(" ");
        ArrayList<String> studentNames = new ArrayList<>();
        for (String name : namesArray) {
            studentNames.add(name);
        }

        System.out.println("Enter the name to search for:");
        String searchName = scanner.nextLine();

        if (studentNames.contains(searchName)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}