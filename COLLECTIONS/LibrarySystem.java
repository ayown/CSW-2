package COLLECTIONS;

import java.util.*;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author );
    }
}

public class LibrarySystem {
    private final ArrayList<Book> li;

    public LibrarySystem() {
        li = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        li.add(new Book(title, author));
        System.out.println("Book added: " + title);
    }

    public void removeBook(String title) {
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i).title.equalsIgnoreCase(title)) {
                li.remove(i);
                System.out.println("Book removed: " + title);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void searchBook(String title) {
        for (Book book : li) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                book.displayBookInfo();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void displayAllBooks() {
        if (li.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Library Books:");
            for (Book book : li) {
                book.displayBookInfo();
            }
        }
    }

    public void showTotalBooks() {
        System.out.println("Total number of books available: " + li.size());
    }

    public static void main(String[] args) {
        LibrarySystem s = new LibrarySystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Remove a Book");
            System.out.println("3. Search for a Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Show Total Number of Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    s.addBook(title, author);
                    break;

                case 2:
                    System.out.print("Enter the title of the book to remove: ");
                    String removeTitle = sc.nextLine();
                    s.removeBook(removeTitle);
                    break;

                case 3:
                    System.out.print("Enter the title of the book to search: ");
                    String searchTitle = sc.nextLine();
                    s.searchBook(searchTitle);
                    break;

                case 4:
                    s.displayAllBooks();
                    break;

                case 5:
                    s.showTotalBooks();
                    break;

                case 6:
                    System.out.println("Exiting the system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
