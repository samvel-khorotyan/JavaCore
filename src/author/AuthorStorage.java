package author;

public class AuthorStorage {

    private Author[] authors = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (size == authors.length) {
            extend();
        }
        authors[size++] = author;

    }

    private void extend() {
        Author[] authors1 = new Author[size + 10];
        for (int i = 0; i < authors.length; i++) {
            authors1[i] = authors[i];
        }
        authors = authors1;
    }

    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index:" + index);
            return null;
        }
        return authors[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }
}

