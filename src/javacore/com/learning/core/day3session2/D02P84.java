package javacore.com.learning.core.day3session2;

import java.util.Date;
import java.util.TreeSet;
 
class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private Date publicationDate;
    private String author;

    public Book(int bookId, String title, double price, Date publicationDate, String author) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.publicationDate = publicationDate;
        this.author = author;
    }

 
    @Override
    public String toString() {
        return bookId + " " + title + "\n" +
                price + "\n" +
                author + "\n" +
                publicationDate;
    }
 
    @Override
    public int hashCode() {
        return Integer.hashCode(bookId);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return bookId == book.bookId;
    }
 
    @Override
    public int compareTo(Book other) {
        return this.author.compareTo(other.author);
    }
}
 
public class D02P84 {
    public static void main(String[] args) {
    
        TreeSet<Book> bookSet = new TreeSet<>();

        bookSet.add(new Book(1001, "Python Learning", 715.0, new Date(120, 1, 2), "Martic C. Brown"));
        bookSet.add(new Book(1002, "Modern Mainframe", 295.0, new Date(97, 4, 19), "Sharad"));
        bookSet.add(new Book(1003, "Java Programming", 523.0, new Date(84, 10, 23), "Gilad Bracha"));
        bookSet.add(new Book(1004, "Read C++", 295.0, new Date(84, 10, 19), "Henry Harvin"));
        bookSet.add(new Book(1005, "Net Platform", 3497.0, new Date(84, 2, 6), "Mark J. Price"));
    }
}
