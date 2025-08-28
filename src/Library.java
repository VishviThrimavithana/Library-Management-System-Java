import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void borrowBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && !book.isBorrowed()) {
                book.borrowBook();
                System.out.println("You borrowed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && book.isBorrowed()) {
                book.returnBook();
                System.out.println("You returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("Invalid book ID.");
    }
}
