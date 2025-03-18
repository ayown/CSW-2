package ASSIGNMENT2_1;

public class Book {
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

    public String toString() {
        return "Book ID: " + bookId + "\nBook Name: " + bookName + "\nPrice: Rs." + price;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book otherBook = (Book) obj;
        return Double.compare(otherBook.price, price) == 0;
    }
}

class BookDriver {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Java Programming", 45.99);
        Book book2 = new Book(102, "Data Structures", 45.99);

        if (book1.equals(book2)) {
            System.out.println("Both books have the same price.");
        } else {
            System.out.println("The books have different prices.");
        }

        System.out.println("\nBook 1 Details:");
        System.out.println(book1);

        System.out.println("\nBook 2 Details:");
        System.out.println(book2);
    }
}
