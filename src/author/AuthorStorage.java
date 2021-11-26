package author;

public class AuthorStorage {

    private Author[] author = new Author[10];
    private int size;

    public void add(Author value) {
        if (size == author.length) {
            extend();
        }
        author[size++] = value;
    }

    private void extend() {
        Author[] array1 = new Author[author.length + (author.length / 2)];
        System.arraycopy(author, 0, array1, 0, author.length);
        author = array1;
    }

    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("Invalid Index " + index);
            return null;
        } else {
            return author[index];
        }
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println(author[i]);
        }
        System.out.println();
    }

    public void searchAuthorsByName(String keyword) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (author[i].getName().contains(keyword) || author[i].getSurname().contains(keyword)) {
                System.out.println(author[i]);
            }
        }
        System.out.println();
    }

    public void searchAuthorsByAge(int minAge, int maxAge) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (author[i].getAge() >= minAge && author[i].getAge() <= maxAge) {
                System.out.println(author[i]);
            }
        }
        System.out.println();
    }

    public Author getBYEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (author[i].getEmail().equals(email)) {
                return author[i];
            }
        }
        return null;
    }

    public void deleteAuthor(String email) {
        int length = size;
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (author[i].getEmail().equals(email)) {
                author[i] = null;
                size--;
            } else {
                author[j] = author[i];
                author[i] = null;
                j++;
            }
        }
    }
}


