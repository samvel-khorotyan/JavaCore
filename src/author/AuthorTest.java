package author;

import java.util.Scanner;

public class AuthorTest {

    static BookStorage bookStorage = new BookStorage();

    static AuthorStorage authorStorage = new AuthorStorage();

    static Scanner scanner = new Scanner(System.in);

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHORS_BY_NAME = "3";
    private static final String SEARCH_AUTHORS_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String PRINT_AUTHORS = "6";
    private static final String PRINT_BOOKS = "7";
    private static final String SEARCH_BOOKS_BY_AUTHOR = "8";
    private static final String COUNT_BOOKS_BY_AUTHOR = "9";
    private static final String CHANGE_AUTHOR = "10";
    private static final String CHANGE_BOOK_AUTHOR = "11";
    private static final String DELETE_BY_AUTHOR = "12";
    private static final String DELETE_AUTHOR = "13";
    private static final String DELETE_BOOK = "14";

    public static void main(String[] args) {

//        authorStorage.add(new Author("Armen", "Hayrapetyan", 22, "hayrapetyan@gmail.com", "male"));
//        authorStorage.add(new Author("Karine", "Saroyan", 23, "sargsyan@gmail.com", "female"));
//        authorStorage.add(new Author("Petros", "Petrosyan", 25, "petrosyan@email.com", "male"));

        boolean isRran = true;

        while (isRran) {

            printCommands();

            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRran = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS_BY_NAME:
                    searchAuthorsByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchAuthorsByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBookByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBooksByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                case DELETE_BY_AUTHOR:
                    deleteByAuthor();
                    break;
                case DELETE_AUTHOR:
                    deleteAuthor();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                default:
                    System.out.println();
                    System.err.println("INVALID COMMAND");
            }
        }
    }

    private static void deleteBook() {
        System.out.println("please choose book's serialID");
        System.out.println("___________________");
        bookStorage.print();
        System.out.println("___________________");
        System.out.println("please input serialID");
        String serialID = scanner.nextLine();
        Book book = bookStorage.getBySerialId(serialID);
        if (book != null) {
            bookStorage.deleteBook(book);
            System.out.println();
            System.out.println("The book has been deleted");
        } else {
            System.out.println();
            System.err.println("Book with serialID does not exists");
        }
    }

    private static void deleteAuthor() {
        chooseEmail();
        System.out.println("please input Author's email");
        String email = scanner.nextLine();
        Author author = authorStorage.getBYEmail(email);
        if (author != null) {
            authorStorage.deleteAuthor(author);
            System.out.println();
            System.out.println("The author has been deleted");
        } else {
            System.out.println();
            System.err.println("Author does not exists");
        }
    }

    private static void deleteByAuthor() {
        chooseEmail();
        System.out.println("please input Author's email");
        String email = scanner.nextLine();
        Author author = authorStorage.getBYEmail(email);
        if (author != null) {
            bookStorage.deleteByAuthor(author);
            System.out.println();
            System.out.println("The author's books have been deleted");
        } else {
            System.out.println();
            System.err.println("Author does not exists");
        }
    }

    private static void chooseEmail() {
        System.out.println("please choose author's email");
        System.out.println("___________________");
        authorStorage.print();
        System.out.println("___________________");
    }

    private static void changeBookAuthor() {
        System.out.println("please choose book's serialID");
        System.out.println("___________________");
        bookStorage.print();
        System.out.println("___________________");
        System.out.println("please input serialID");
        String serialID = scanner.nextLine();
        Book book = bookStorage.changeBookAuthor(serialID);
        if (book != null) {
            chooseEmail();
            System.out.println("please input Author's email");
            String email = scanner.nextLine();
            Author author = authorStorage.getBYEmail(email);
            if (author != null) {
                book.setAuthor(author);
                System.out.println();
                System.out.println("Thank you book's author is changed");
            } else {
                System.out.println();
                System.err.println("Author does not exists");
            }
        } else {
            System.out.println();
            System.err.println("book with serialID does not exists");
        }
    }

    private static void changeAuthor() {
        chooseEmail();
        System.out.println("please input Author's email");
        String email = scanner.nextLine();
        Author author = authorStorage.getBYEmail(email);
        if (author != null) {
            System.out.println("please input author's name");
            String name = scanner.nextLine();
            System.out.println("please input author's surname");
            String surname = scanner.nextLine();
            System.out.println("please input author's gender");
            String gender = scanner.nextLine();
            System.out.println("please input author's age");
            int age = Integer.parseInt(scanner.nextLine());

            author.setName(name);
            author.setSurname(surname);
            author.setGender(gender);
            author.setAge(age);

            System.out.println();
            System.out.println("Thank you,author data changed");

        } else {
            System.out.println();
            System.err.println("Author does not exists");
        }
    }

    private static void countBooksByAuthor() {
        chooseEmail();
        System.out.println("please input Author's email");
        String email = scanner.nextLine();
        Author author = authorStorage.getBYEmail(email);
        if (author != null) {
            bookStorage.countBooksByAuthor(author);
        } else {
            System.out.println();
            System.err.println("Author does not exists");
        }
    }

    private static void searchBookByAuthor() {
        chooseEmail();
        System.out.println("please input Author's email");
        String email = scanner.nextLine();
        Author author = authorStorage.getBYEmail(email);
        if (author != null) {
            bookStorage.searchBookByAuthor(author);
        } else {
            System.out.println();
            System.err.println("Author does not exists");
        }
    }

    private static void searchBooksByTitle() {
        System.out.println("please input book's title keyword");
        String title = scanner.nextLine();

        bookStorage.searchBooksByTitle(title);
    }

    private static void searchAuthorsByAge() {
        System.out.println("please input minAge keyword");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input maxAge keyword");
        int maxAge = Integer.parseInt(scanner.nextLine());

        authorStorage.searchAuthorsByAge(minAge, maxAge);
    }

    private static void searchAuthorsByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();

        authorStorage.searchAuthorsByName(keyword);
    }

    private static void addBook() {
        chooseEmail();
        System.out.println("please input Author's email");
        String email = scanner.nextLine();
        Author author = authorStorage.getBYEmail(email);
        if (author != null) {
            System.out.println("Please enter the serialId of the book");
            String serialId = scanner.nextLine();
            if (bookStorage.getBySerialId(serialId) == null) {
                System.out.println("Please enter the title of the book");
                String title = scanner.nextLine();
                System.out.println("Please enter a book description");
                String description = scanner.nextLine();
                System.out.println("Please enter the price of the book");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Please enter how many items we have from this book");
                int count = Integer.parseInt(scanner.nextLine());

                Book book = new Book(serialId, title, description, price, count, author);

                bookStorage.add(book);

                System.out.println();
                System.out.println("Thank you,book was added");
            } else {
                System.out.println();
                System.err.println("Book with serialID: " + serialId + " is exists");
            }
        } else {
            System.out.println();
            System.err.println("invalid email! please try again");

            addBook();
        }
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
        System.out.println("Thank you,author was added");
    }

    private static void printCommands() {
        System.out.println();
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + SEARCH_AUTHORS_BY_NAME + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for search books by title");
        System.out.println("please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("please input " + PRINT_BOOKS + " for print books");
        System.out.println("please input " + SEARCH_BOOKS_BY_AUTHOR + " for search books by author");
        System.out.println("please input " + COUNT_BOOKS_BY_AUTHOR + " for count books by author");
        System.out.println("please input " + CHANGE_AUTHOR + " for change author");
        System.out.println("please input " + CHANGE_BOOK_AUTHOR + " for change book author");
        System.out.println("please input " + DELETE_BY_AUTHOR + " for delete book's by author");
        System.out.println("please input " + DELETE_AUTHOR + " for delete author");
        System.out.println("please input " + DELETE_BOOK + " for delete book");
    }
}






