package newAuthor.storage;

import newAuthor.exception.BookNotFoundException;
import newAuthor.model.Author;
import newAuthor.model.Book;
import newAuthor.util.ArrayUtil;
import newAuthor.util.FileUtil;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BookStorage {

    private List<Book> books = new LinkedList<>();

    public void add(Book book) {
        books.add(book);
        serialize();
    }

    public void print() {
        ArrayUtil.print(books.toArray());
/*        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book);
        }*/
    }

    public Book getBySerialId(String serialId) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getSerialId().equals(serialId)) {
                return book;
            }
        }
        throw new BookNotFoundException("book does not exists. serialID; " + serialId);
    }

    public void searchBooksByTitle(String title) {
        System.out.println();
        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                System.out.println(book);
            }
        }
    }

    public void searchBookByAuthor(Author author) {
        System.out.println();
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                System.out.println(book);
            }
        }
    }

    public void countBooksByAuthor(Author author) {
        System.out.println();
        int count = 0;
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                count++;
            }
        }
        System.out.println("count of " + author.getEmail() + "author's book is " + count);
    }

    public void deleteByAuthor(Author author) {
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                books.remove(book);
            }
        }
        serialize();
    }

    public void deleteBook(Book book) {
        books.remove(book);
        serialize();
    }

    public void initData() {
        List<Book> booksList = FileUtil.DeSerializeBooks();
        if (booksList != null) {
            this.books = booksList;
        }
    }

    public void serialize() {
        FileUtil.serializeBooks(books);
    }
}
