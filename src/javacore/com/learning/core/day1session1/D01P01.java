package javacore.com.learning.core.day1session1;

public class D01P01 {
	   private String title;
	   private double price;
	  
	   public D01P01(String title, double price) {
	       this.title = title;
	       this.price = price;
	   }
	  
	   public String getTitle() {
	       return title;
	   }
	   public void setTitle(String title) {
	       this.title = title;
	   }
	   public double getPrice() {
	       return price;
	   }
	   public void setPrice(double price) {
	       this.price = price;
	   }
	

	   public static void createBooks(String title, double price) {
	       D01P01 book = new D01P01(title, price);
	       showBooks(book);
	   }
	   public static void showBooks(D01P01 book) {
	       System.out.println("Book Title: " + book.getTitle() + " and Price: " + book.getPrice());
	   }
	   public static void main(String[] args) {
	       createBooks("Java Programming", 350.00);
	   }
}



