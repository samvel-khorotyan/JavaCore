package author;

public class BookStorage {

    private Book[] book = new Book[10];
    private int size;

    public void add(Book value) {
        if (size == book.length) {
            extend();
        }
        book[size++] = value;
    }

    private void extend() {
        Book[] book1 = new Book[book.length + (book.length / 2)];
        System.arraycopy(book, 0, book1, 0, book.length);
        book = book1;
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println(book[i]);
        }
        System.out.println();
    }

    public Book getBySerialId(String serialId) {
        for (int i = 0; i < size; i++) {
            if (book[i].getSerialId().equals(serialId)) {
                return book[i];
            }
        }
        return null;
    }

    public void searchBooksByTitle(String title) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (book[i].getTitle().contains(title)) {
                System.out.println(book[i]);
            }
        }
        System.out.println();
    }

    public void searchBookByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (book[i].getAuthor().equals(author)) {
                System.out.println(book[i]);
            }
        }
        System.out.println();
    }

    public void countBooksByAuthor(Author author) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (book[i].getAuthor().equals(author)) {
                count++;
            }
        }
        System.out.println();
        System.out.println("count of " + author.getEmail() + "author's book is " + count);
        System.out.println();
    }

    public Book changeBookAuthor(String serialiId) {
        for (int i = 0; i < size; i++) {
            if (book[i].getSerialId().equals(serialiId)) {
                return book[i];
            }
        }
        return null;
    }

    public void deleteByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (book[i].getAuthor().equals(author)) {
                ArrayUtil.deleteByIndex(book, i, size);
            }
        }
        size--;
    }

    public void deleteBook(Book books) {
        for (int i = 0; i < size; i++) {
            if (book[i].equals(books)) {
                ArrayUtil.deleteByIndex(book, i, size);
                break;
            }
        }
        size--;
    }
}
