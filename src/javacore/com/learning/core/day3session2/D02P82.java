package javacore.com.learning.core.day3session2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class D02P82 {
    public static void main(String[] args) {

    	
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");

        String nameToSearch = "Joseph";
        String phoneNumber = phoneBook.get(nameToSearch);
        System.out.println(phoneNumber);
    }
}