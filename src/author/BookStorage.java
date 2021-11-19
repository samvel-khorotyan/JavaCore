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
}
