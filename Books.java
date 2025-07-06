public class Book {
    String title;
    boolean isAvailable = true;

    public Book(String title) {
        this.title = title;
    }

    public void borrowBook() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }
}
