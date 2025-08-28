import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Sample books
        library.addBook(new Book(1, "Harry Potter", "J.K. Rowling"));
        library.addBook(new Book(2, "Lord of the Rings", "J.R.R. Tolkien"));
        library.addBook(new Book(3, "Sherlock Holmes", "Arthur Conan Doyle"));

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> library.showBooks();
                case 2 -> {
                    System.out.print("Enter book ID: ");
                    int id = scanner.nextInt();
                    library.borrowBook(id);
                }
                case 3 -> {
                    System.out.print("Enter book ID: ");
                    int id = scanner.nextInt();
                    library.returnBook(id);
                }
                case 4 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
