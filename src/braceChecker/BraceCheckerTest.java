package braceChecker;

public class BraceCheckerTest {

    public static void main(String[] args) {

        BraceChecker braceChecker = new BraceChecker("He}l[lo (from) Jav[a}");

        braceChecker.check();
    }
}
