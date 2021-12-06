package author;

import author.model.Author;

import author.model.Book;

import author.storage.AuthorStorage;

import author.storage.BookStorage;

import author.util.DateUtil;

import java.text.ParseException;

import java.util.Date;

import java.util.Scanner;

public class AuthorBookTest implements AuthorBookCommands {

    static BookStorage bookStorage = new BookStorage();

    static AuthorStorage authorStorage = new AuthorStorage();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        initData();

        boolean isRun = true;

        while (isRun) {

            AuthorBookCommands.printCommands();

            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
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
                case ADD_TAG_TO_BOOK:
                    addTagToBook();
                    break;
                case REMOVE_TAGS_TO_BOOK:
                    removeTagsToBook();
                    break;
                default:
                    System.out.println();
                    System.err.println("INVALID COMMAND");
            }
        }
    }

    private static void removeTagsToBook() {
        System.out.println("please choose book's serialID");
        System.out.println("___________________");
        bookStorage.print();
        System.out.println("___________________");
        System.out.println("please input serialID");
        String serialID = scanner.nextLine();
        Book book = bookStorage.changeBookAuthor(serialID);
        if (book != null) {
            System.out.println("please input tags separate ,");
            String tagsStr = scanner.nextLine();
            String[] tagsToRemove = tagsStr.split(",");
            String[] bookTags = book.getTags();
            if (bookTags == null) {
                System.out.println();
                System.err.println("book does not have any tags to remove!!!");
            } else {
                for (String tag : tagsToRemove) {
                    boolean isExist = false;
                    for (String bookTag : bookTags) {
                        if (bookTag.equals(tag)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist) {
                        System.out.println();
                        System.err.println(tag + "does not exists on book: " + book);
                        return;
                    }
                }
                String[] newTags = new String[bookTags.length - tagsToRemove.length];
                int index = 0;
                for (String bookTag : bookTags) {
                    boolean isExist = false;
                    for (String toRemove : tagsToRemove) {
                        if (bookTag.equals(toRemove)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist) {
                        newTags[index++] = bookTag;
                    }
                }
                book.setTags(newTags);
            }
        }
    }

    private static void addTagToBook() {
        System.out.println("please choose book's serialID");
        System.out.println("___________________");
        bookStorage.print();
        System.out.println("___________________");
        System.out.println("please input serialID");
        String serialID = scanner.nextLine();
        Book book = bookStorage.changeBookAuthor(serialID);
        if (book != null) {
            System.out.println("please input tags separate ,");
            String tagsStr = scanner.nextLine();
            String[] tags = tagsStr.split(",");
            String[] bookTags = book.getTags();
            if (bookTags == null) {
                book.setTags(tags);
            } else {
                for (String tag : tags) {
                    for (String bookTag : bookTags) {
                        if (tag.equals(bookTag)) {
                            System.out.println();
                            System.err.println(tag + "is duplicate please input new tags");
                            return;
                        }
                    }
                }
                String[] newTags = new String[bookTags.length + tags.length];
                System.arraycopy(bookTags, 0, newTags, 0, bookTags.length);
                System.arraycopy(tags, 0, newTags, bookTags.length, tags.length);
                book.setTags(newTags);
            }
            System.out.println();
            System.out.println("Tags were added!");
        }
    }

    private static void initData() throws ParseException {
        Author author1 = new Author("Armen", "Hayretyan", 22, "hayrapetyan@gmail.com", "male", DateUtil.stringToDate("12/05/1991"));
        Author author2 = new Author("Karine", "Saroyan", 23, "sargsyan@gmail.com", "female", DateUtil.stringToDate("11/03/1999"));
        Author author3 = new Author("Petros", "Petrosyan", 25, "petrosyan@email.com", "male", DateUtil.stringToDate("30/07/1980"));
        authorStorage.add(author1);
        authorStorage.add(author2);
        authorStorage.add(author3);

        Author[] authors = {author1, author2};
        Author[] authors1 = {author3};
        String[] tags = {"new", "popular", "detektiv", "lav girq"};

        Book book = new Book("FD578", "girq1", "vep", 4800, 20, authors, tags);
        Book book1 = new Book("KL987", "girq2", "gexarvestakan", 3700, 13, authors1);
        bookStorage.add(book);
        bookStorage.add(book1);
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
        System.out.println("please choose author's emails separate ,");
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
            System.out.println("please input Author's emails separate ,");
            String emails = scanner.nextLine();
            String[] emailArray = emails.split(",");
            if (emailArray.length == 0) {
                System.out.println("please choose authors");
                return;
            }
            Author[] authors = new Author[emailArray.length];
            int index = 0;
            for (String email : emailArray) {
                Author author = authorStorage.getBYEmail(email);
                if (author != null) {
                    authors[index++] = author;
                } else {
                    System.out.println("please input correct authors email");
                    return;
                }
            }
            book.setAuthors(authors);

            System.out.println();
            System.out.println("Thank you book's author is changed");
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

            author.setName(name);
            author.setSurname(surname);
            author.setGender(gender);

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

    private static void searchAuthorsByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();

        authorStorage.searchAuthorsByName(keyword);
    }

    private static void addBook() {
        chooseEmail();
        System.out.println("please input Author's emails separate ,");
        String emails = scanner.nextLine();
        String[] emailArray = emails.split(",");
        if (emailArray.length == 0) {
            System.out.println("please choose authors");
            return;
        }
        Author[] authors = new Author[emailArray.length];
        int index = 0;
        for (String email : emailArray) {
            Author author = authorStorage.getBYEmail(email);
            if (author != null) {
                authors[index++] = author;
            } else {
                System.out.println("please input correct authors email");
                return;
            }
        }
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
            System.out.println("please input book's tags separate ,");
            String tagsStr = scanner.nextLine();
            String[] tags = tagsStr.split(",");

            Book book = new Book(serialId, title, description, price, count, authors, tags);

            bookStorage.add(book);

            System.out.println();
            System.out.println("Thank you,book was added");
        } else {
            System.out.println();
            System.err.println("Book with serialID: " + serialId + " is exists");
        }
    }

    private static void addAuthor() throws ParseException {
        System.out.println("please input author's name");
        String name = scanner.nextLine();
        System.out.println("please input author's surname");
        String surname = scanner.nextLine();
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        System.out.println("please input author's gender");
        String gender = scanner.nextLine();
        System.out.println("please input author's dateOfBirth format-[12/12/12]");
        String date1 = scanner.nextLine();
        Date date = DateUtil.stringToDate(date1);

        Author author = new Author(name, surname, email, gender, date);

        authorStorage.add(author);

        System.out.println();
        System.out.println("Thank you,author was added");
    }
}






