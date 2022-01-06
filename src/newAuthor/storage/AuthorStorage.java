package newAuthor.storage;

import newAuthor.model.Author;
import newAuthor.util.ArrayUtil;
import newAuthor.util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class AuthorStorage {

    private List<Author> authors = new ArrayList<>();

    public void add(Author author) {
        authors.add(author);
        serialize();
    }

    public void print() {
        ArrayUtil.print(authors.toArray());
    }

    public void searchAuthorsByName(String keyword) {
        System.out.println();
        for (Author author : authors) {
            if (author.getName().contains(keyword) || author.getSurname().contains(keyword)) {
                System.out.println(author);
            }
        }
        System.out.println();
    }

    public Author getBYEmail(String email) {
        for (Author author : authors) {
            if (author.getEmail().equals(email)) {
                return author;
            }
        }
        return null;
    }

    public void deleteAuthor(Author author) {
        authors.remove(author);
        serialize();
    }

    public void initData() {
        List<Author> authorList = FileUtil.DeSerializeAuthors();
        if (authorList != null) {
            authors = authorList;
        }
    }

    public void serialize() {
        FileUtil.serializeAuthors(authors);
    }
}
