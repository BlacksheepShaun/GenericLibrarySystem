import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        //Library for book
//        Library<Book> bookLibrary = new Library<Book>();
//        bookLibrary.addItem(new Book("1","The Law of Human Nature", "Robert Greene"));
//        bookLibrary.addItem(new Book("2","The 48 Laws of Power", "Robert Greene"));
//
//        System.out.println("Books in Library:");
//        bookLibrary.displayItems();
//
//        System.out.println("Enter id to get the book:");
//        String id = scan.nextLine();
//
//        Book foundBook = bookLibrary.findById(id);
//
//        System.out.println(foundBook.getTitle());
//
//        //Library for Magazine
//        Library<Magazine> magazineLibrary = new Library<Magazine>();
//        magazineLibrary.addItem(new Magazine("1", "national Geographic", "National Geographic Society"));
//
//        System.out.println("Magazines in Library:");
//        magazineLibrary.displayItems();
//
//        System.out.println("Enter your name to borrow the book:");
//        String name = scan.nextLine();
//        System.out.println("Enter your userID to borrow the book:");
//        String userId = scan.nextLine();
//
//
//        Member member = new Member(name, userId);
//        Book bookToBorrow = bookLibrary.findById(scan.nextLine());
//        if (bookToBorrow != null) {
//            Transaction<Book> transaction = new Transaction<Book>(member, bookToBorrow);
//            System.out.println("Transaction Detail\n");
//            System.out.println(transaction.getDetails());
//
//        }

//        System.out.println("Enter username, userId and password to create an account");
        AccountManager accountManager = new AccountManager();
        accountManager.createNewAccount("user1", "1001", "password123");
        accountManager.createNewAccount("user2", "1002", "myPassword");
        accountManager.createNewAccount("user1", "1003", "anotherPassword");

        Library<Book> bookLibrary = new Library<Book>(accountManager);
        bookLibrary.addItem(new Book("1","The Law of Human Nature", "Robert Greene"));
        bookLibrary.addItem(new Book("2","The 48 Laws of Power", "Robert Greene"));

        System.out.println("Enter username, userId and password to login");
        String username = scan.nextLine();
        String userId = scan.nextLine();
        String password = scan.nextLine();

        //accountManager.createNewAccount(username, userId, password);


//        username = scan.nextLine();
//        userId = scan.nextLine();
//        password = scan.nextLine();
        System.out.println(accountManager.login(username, userId, password));

        System.out.println(accountManager.isLoggedIn(username));
        if(accountManager.isLoggedIn(username)) {
            bookLibrary.displayItems(username);
        }

    }
}