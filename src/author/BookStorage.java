package author;

public class BookStorage {

    private Book[] array = new Book[10];
    private int size;

    public void add(Book book) {
        if (size == array.length) {
            extend();
        }
        array[size++] = book;
    }

    private void extend() {
        Book[] array1 = new Book[array.length + (array.length / 2)];
        System.arraycopy(array, 0, array1, 0, array.length);
        array = array1;
    }

    public void searchBooksByTitle(String keyword) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (array[i].getTitle().contains(keyword)) {
                System.out.println(array[i]);
            }
        }
        System.out.println();
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public void searchBooksByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthor().getEmail().equals(email)) {
                System.out.println(array[i]);
                System.out.println();
            } else {
                System.err.println("There is no book by that author");
                System.out.println();
                break;
            }
        }
    }

    public void countBooksByAuthor(String email) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthor().getEmail().equals(email)) {
                count++;
            }
        }
        System.out.println();
        System.out.println("The author has " + count + " books");
        System.out.println();
    }

    public Book changeBookAuthor(String title) {
        for (int i = 0; i < size; i++) {
            if (array[i].getTitle().equals(title)) {
                return array[i];
            }
        }
        return null;
    }
}