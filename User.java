public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            System.out.println(name + " borrowed \"" + book.getTitle() + "\"");
        } else {
            System.out.println("Sorry, that book is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        book.returnBook();
        System.out.println(name + " returned \"" + book.getTitle() + "\"");
    }
}
