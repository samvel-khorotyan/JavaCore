package author;

public class AuthorStorage {

    private Author[] array = new Author[10];
    private int size;

    public void add(Author author) {
        if (size == array.length) {
            extend();
        }
        array[size++] = author;
    }

    private void extend() {
        Author[] array1 = new Author[array.length + (array.length / 2)];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }

    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("Invalid Index " + index);
            return null;
        } else {
            return array[index];
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}

