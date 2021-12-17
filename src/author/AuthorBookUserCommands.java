package author;

public interface AuthorBookUserCommands {

    String LOGOUT = "0";
    String EXIT = "1";
    String ADD_AUTHOR = "2";
    String ADD_BOOK = "3";
    String SEARCH_AUTHORS_BY_NAME = "4";
    String SEARCH_BOOKS_BY_TITLE = "5";
    String PRINT_AUTHORS = "6";
    String PRINT_BOOKS = "7";
    String SEARCH_BOOKS_BY_AUTHOR = "8";
    String COUNT_BOOKS_BY_AUTHOR = "9";
    String CHANGE_AUTHOR = "10";
    String CHANGE_BOOK_AUTHOR = "11";
    String DELETE_BY_AUTHOR = "12";
    String DELETE_AUTHOR = "13";
    String DELETE_BOOK = "14";
    String ADD_TAG_TO_BOOK = "15";
    String REMOVE_TAGS_TO_BOOK = "16";
    //  User commands
    String REGISTER = "2";
    String LOGIN = "3";

    static void printAdminCommands() {
        System.out.println();
        System.out.println("please input " + LOGOUT + " for logout");
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + SEARCH_AUTHORS_BY_NAME + " for search author by name");
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
        System.out.println("please input " + ADD_TAG_TO_BOOK + " for add tag to book");
        System.out.println("please input " + REMOVE_TAGS_TO_BOOK + " for remove tag from book");
    }

    static void printUserCommands() {
        System.out.println();
        System.out.println("please input " + LOGIN + " for logout");
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + SEARCH_AUTHORS_BY_NAME + " for search author by name");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for search books by title");
        System.out.println("please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("please input " + PRINT_BOOKS + " for print books");
        System.out.println("please input " + SEARCH_BOOKS_BY_AUTHOR + " for search books by author");
        System.out.println("please input " + COUNT_BOOKS_BY_AUTHOR + " for count books by author");
    }

    static void printSuperUserCommands() {
        System.out.println();
        System.out.println("please input " + LOGOUT + " for logout");
        System.out.println("please input " + REGISTER + " for register");
        System.out.println("please input " + LOGIN + " for login");
    }
}
