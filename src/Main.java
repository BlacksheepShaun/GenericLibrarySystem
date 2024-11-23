import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Library for book
        Library<Book> bookLibrary = new Library<Book>();
        bookLibrary.addItem(new Book("1","The Law of Human Nature", "Robert Greene"));
        bookLibrary.addItem(new Book("2","The 48 Laws of Power", "Robert Greene"));

        System.out.println("Books in Library:");
        bookLibrary.displayItems();

        System.out.println("Enter id to get the book:");
        String id = scan.nextLine();

        Book foundBook = bookLibrary.findById(id);

        System.out.println(foundBook.getTitle());

        //Library for Magazine
        Library<Magazine> magazineLibrary = new Library<Magazine>();
        magazineLibrary.addItem(new Magazine("1", "national Geographic", "National Geographic Society"));

        System.out.println("Magazines in Library:");
        magazineLibrary.displayItems();

    }
}