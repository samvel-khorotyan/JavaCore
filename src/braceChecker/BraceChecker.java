package braceChecker;

public class BraceChecker {

    Stack stack = new Stack();

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '{' || text.charAt(i) == '[' || text.charAt(i) == '(') {
                stack.push(text.charAt(i));
            } else if (text.charAt(i) == '}' || text.charAt(i) == ']' || text.charAt(i) == ')') {
                switch (stack.pop()) {
                    case '(':
                        if (text.charAt(i) != ')') {
                            System.err.println("Error: " + text.charAt(i) + " at " + i);
                        }
                        break;
                    case '[':
                        if (text.charAt(i) != ']') {
                            System.err.println("Error: " + text.charAt(i) + " at " + i);
                        }
                        break;
                    case '{':
                        if (text.charAt(i) != '}') {
                            System.err.println("Error: " + text.charAt(i) + " at " + i);
                        }
                        break;
                }
            }
        }
    }
}




