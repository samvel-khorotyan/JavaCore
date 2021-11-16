package author;

import java.util.Scanner;

public class AuthorTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Author author = new Author();
        AuthorStorage authorStorage = new AuthorStorage();

        System.out.println("քանի հեղինակ ունենք");
        int nam = scanner.nextInt();


        for (int i = 0; i < nam; i++) {
            System.out.println("մուտքագրեք անունը");
            author.setName(scanner.next());
            System.out.println("մուտքագրեք ազգանունը");
            author.setSurname(scanner.next());
            System.out.println("մուտքագրեք email-ը");
            author.setEmail(scanner.next());
            System.out.println("մուտքագրեք տարիքը");
            author.setAge(scanner.nextInt());
            System.out.println("մուտքագրեք սեռը");
            author.setGender(scanner.next());
            authorStorage.add(author);
        }
        authorStorage.print();
    }
}