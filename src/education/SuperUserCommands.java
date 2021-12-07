package education;

public interface SuperUserCommands {

    String EXIT_0 = "0";
    String REGISTER_1 = "1";
    String LOGIN_2 = "2";


    static void printUserCommands() {
        System.out.println();
        System.out.println("please input " + EXIT_0 + " for exit");
        System.out.println("please input " + REGISTER_1 + " for register");
        System.out.println("please input " + LOGIN_2 + " for login");
    }
}


