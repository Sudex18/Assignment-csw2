package genericspt2;

import java.util.HashMap;
import java.util.Map;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    
    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    // Getter methods for book attributes
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class genq5 {
    public static void main(String[] args) {
        // Create a HashMap to store book entries
        Map<Integer, Book> bookMap = new HashMap<>();

        // Instantiate two Book objects
        Book book1 = new Book(101, "The Great artist", "sudeshna", 5);
        Book book2 = new Book(102, "my life", "misti", 3);

        
        bookMap.put(book1.getId(), book1);
        bookMap.put(book2.getId(), book2);

        
        String searchBookName = "The Great Gatsby";
        if (bookMap.values().stream().anyMatch(book -> book.getName().equals(searchBookName))) {
            System.out.println(searchBookName + " is present in the library.");
        } else {
            System.out.println(searchBookName + " is not found.");
        }

        /
        int removeBookId = 102;
        if (bookMap.containsKey(removeBookId)) {
            Book removedBook = bookMap.remove(removeBookId);
            System.out.println("Removed book: " + removedBook.getName());
        } else {
            System.out.println("Book with ID " + removeBookId + " not found.");
        }

        // Print the updated collection of books
        System.out.println("\nUpdated collection of books:");
        for (Book book : bookMap.values()) {
            System.out.println("ID: " + book.getId() + ", Name: " + book.getName() +
                    ", Author: " + book.getAuthor() + ", Quantity: " + book.getQuantity());
        }
    }
}
