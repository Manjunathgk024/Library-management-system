import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(new Book(title));
        System.out.println("Book added: " + title);
    }

    public void viewBooks() {
        for (Book b : books) {
            System.out.println("- " + b.getTitle() + (b.isAvailable() ? " (Available)" : " (Borrowed)"));
        }
    }

    public Book findBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
}
