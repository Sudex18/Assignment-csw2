package genericspt1;

class Book {
    private int bookId;
    private String bookName;
    private double price;

    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book other = (Book) o;
        return Double.compare(other.price, price) == 0;
    }
}

public class genq2 {
    public static void main(String[] args) {
        // Create two book objects
        Book book1 = new Book(106, "The Great extentt", 14.99);
        Book book2 = new Book(107, "To killthe bird", 13.49);

        // Compare book objects based on price
        if (book1.equals(book2)) {
            System.out.println("Both books have same price.");
        } else {
            System.out.println("Books have different prices.");
        }

        // Print book details
        System.out.println("Book 1: ID=" + book1.getBookId() + ", Name=" + book1.getBookName() + ", Price=" + book1.getPrice());
        System.out.println("Book 2: ID=" + book2.getBookId() + ", Name=" + book2.getBookName() + ", Price=" + book2.getPrice());
    }
}
