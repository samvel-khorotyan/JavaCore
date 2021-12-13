package homework.author.storage;

import homework.author.exception.BookNotFoundException;
import homework.author.util.ArrayUtil;
import homework.author.model.Author;
import homework.author.model.Book;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size;

    public void add(Book value) {
        if (size == books.length) {
            extend();
        }
        books[size++] = value;
    }

    private void extend() {
        Book[] books1 = new Book[books.length + (books.length / 2)];
        System.arraycopy(books, 0, books1, 0, books.length);
        books = books1;
    }

    public void print() {
        ArrayUtil.print(books,size);
    }

    public Book getBySerialId(String serialId) throws BookNotFoundException {
        for (int i = 0; i < size; i++) {
            if (books[i].getSerialId().equals(serialId)) {
                return books[i];
            }
        }
        throw new BookNotFoundException("book does not exists. serialID; " + serialId);
    }

    public void searchBooksByTitle(String title) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(title)) {
                System.out.println(books[i]);
            }
        }
        System.out.println();
    }

    public void searchBookByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            for (Author author1 : books[i].getAuthors()) {
                if (author1.equals(author)) {
                    System.out.println(books[i]);
                }
            }
        }
        System.out.println();
    }

    public void countBooksByAuthor(Author author) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (Author author1 : books[i].getAuthors()) {
                if (author1.equals(author)) {
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("count of " + author.getEmail() + "homework.author's book is " + count);
        System.out.println();
    }

    public void deleteByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            for (Author author1 : books[i].getAuthors()) {
                if (author1.equals(author)) {
                    ArrayUtil.deleteByIndex(books, i, size);
                }
            }
        }
        size--;
    }

    public void deleteBook(Book books) {
        for (int i = 0; i < size; i++) {
            if (this.books[i].equals(books)) {
                ArrayUtil.deleteByIndex(this.books, i, size);
                break;
            }
        }
        size--;
    }
}
