package author;

import java.util.Scanner;

public class AuthorTest {

    static BookStorage bookStorage = new BookStorage();

    static AuthorStorage authorStorage = new AuthorStorage();

    static Scanner scanner = new Scanner(System.in);

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String SEARCH_AUTHORS_BY_NAME = "2";
    private static final String SEARCH_AUTHORS_BY_AGE = "3";
    private static final String ADD_BOOK = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String PRINt_AUTHORS = "6";
    private static final String PRINT_BOOKS = "7";


    public static void main(String[] args) {

//        authorStorage.add(new Author("poxos","poxosyan",22,"poxosyan@amail.com","male"));
//        authorStorage.add(new Author("poxosuhi","poxosyan",23,"poxosyan@amail.com","female"));
//        authorStorage.add(new Author("petros","petrosyan",25,"petrosyan@amail.com","male"));

        boolean isRan = true;

        while (isRan) {

            printCommands();

            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRan = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case SEARCH_AUTHORS_BY_NAME:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case PRINt_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                default:
                    System.out.println();
                    System.err.println("Invalid command!");
                    System.out.println();
            }
        }
    }

    private static void searchBooksByTitle() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchBooksByTitle(keyword);
    }

    private static void addBook() {
        System.out.println("Please enter the title of the book");
        String title = scanner.nextLine();
        System.out.println("Please enter a book description");
        String description = scanner.nextLine();
        System.out.println("Please enter the price of the book");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter how many items we have from this book");
        int count = Integer.parseInt(scanner.nextLine());

        Book book = new Book(title, description, price, count);

        bookStorage.add(book);

        System.out.println();
        System.out.println("Tanke you,book was added");
        System.out.println();
    }

    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input mix age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + SEARCH_AUTHORS_BY_NAME + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for search books by title");
        System.out.println("please input " + PRINt_AUTHORS + " for print authors");
        System.out.println("please input " + PRINT_BOOKS + " for print books");
    }

    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void addAuthor() {

        System.out.println("please input author's name");
        String name = scanner.nextLine();
        System.out.println("please input author's surname");
        String surname = scanner.nextLine();
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        System.out.println("please input author's gender");
        String gender = scanner.nextLine();
        System.out.println("please input author's age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, age, email, gender);

        authorStorage.add(author);

        System.out.println();
        System.out.println("Tanke you,author was added");
        System.out.println();
    }
}