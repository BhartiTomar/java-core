package javacore.com.learning.core.day1session1;

interface MedicineInfo {
 void displayLabel();
}

class Tablet implements MedicineInfo {
 public void displayLabel() {
     System.out.println("Store Tablets in a cool dry place.");
 }
}

class Syrup implements MedicineInfo {
 public void displayLabel() {
     System.out.println("Syrup is consumable only on prescription.");
 }
}

class Ointment implements MedicineInfo {
 public void displayLabel() {
     System.out.println("Ointment is for external use only.");
 }
}

public class D01P02 {
 public static void main(String[] args) {
 
     MedicineInfo[] medicines = new MedicineInfo[3];
     medicines[0] = new Tablet();
     medicines[1] = new Syrup();
     medicines[2] = new Ointment();

     for (MedicineInfo medicine : medicines) {
         medicine.displayLabel();
     }
 }
}