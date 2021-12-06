package education;

public interface UserCommands {

    String EXIT_0 = "0";
    String LOGIN_1 = "1";
    String REGISTER_2 = "2";

    static void printUserCommands() {
        System.out.println();
        System.out.println("please input " + EXIT_0 + " for exit");
        System.out.println("please input " + LOGIN_1 + " for login");
        System.out.println("please input " + REGISTER_2 + " for register");
    }
}


