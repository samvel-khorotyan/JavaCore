package homework.author.storage;

import homework.author.util.ArrayUtil;

import homework.author.model.Author;

public class AuthorStorage {

    private Author[] authors = new Author[10];
    private int size;

    public void add(Author value) {
        if (size == authors.length) {
            extend();
        }
        authors[size++] = value;
    }

    private void extend() {
        Author[] authors1 = new Author[authors.length + (authors.length / 2)];
        System.arraycopy(authors, 0, authors1, 0, authors.length);
        authors = authors1;
    }

    public void print() {
        ArrayUtil.print(authors,size);
    }

    public void searchAuthorsByName(String keyword) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) || authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }
        System.out.println();
    }

    public Author getBYEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                return authors[i];
            }
        }
        return null;
    }

    public void deleteAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (authors[i].equals(authors)) {
                ArrayUtil.deleteByIndex(authors, i, size);
                break;
            }
        }
        size--;
    }
}

