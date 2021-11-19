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
        System.arraycopy(array, 0, array1, 0, array.length);
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
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public void searchByName(String keyword) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (array[i].getName().contains(keyword) || array[i].getSurname().contains(keyword)) {
                System.out.println(array[i]);
            }
        }
        System.out.println();
    }

    public void searchByAge(int minAge, int maxAge) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (array[i].getAge() > minAge && array[i].getAge() < maxAge) {
                System.out.println(array[i]);
            }
        }
        System.out.println();
    }
}