import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        User user = new User("Manjunath");
        Scanner sc = new Scanner(System.in);

        lib.addBook("Java for Beginners");
        lib.addBook("Data Structures");
        lib.addBook("Design Patterns");

        while (true) {
            System.out.println("\n1. View Books\n2. Borrow Book\n3. Return Book\n4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    lib.viewBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to borrow: ");
                    String title = sc.nextLine();
                    Book b = lib.findBook(title);
                    if (b != null) user.borrowBook(b);
                    else System.out.println("Book not found.");
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String title2 = sc.nextLine();
                    Book b2 = lib.findBook(title2);
                    if (b2 != null) user.returnBook(b2);
                    else System.out.println("Book not found.");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
