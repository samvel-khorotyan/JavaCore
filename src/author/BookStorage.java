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

    public void searchBooksByTitle(String title) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (book[i].getTitle().contains(title)){
                System.out.println(book[i]);
            }
        }
        System.out.println();
    }

    public void searchBookByAuthor(String email) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (book[i].getAuthor().getEmail().equals(email)){
                System.out.println(book[i]);
            }else {
                System.err.println("There is no book by that author");
                System.out.println();
                break;
            }
        }
    }

    public void countBooksByAuthor(String email) {
       int count = 0;
        for (int i = 0; i < size; i++) {
            if (book[i].getAuthor().getEmail().equals(email)){
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
        System.out.println();
    }

    public Book changeBookAuthor(String title) {
        for (int i = 0; i < size; i++) {
            if (book[i].getTitle().equals(title)){
                return book[i];
            }
        }
        return null;
    }
}
