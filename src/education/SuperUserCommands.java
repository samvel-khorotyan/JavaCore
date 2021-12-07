package education;

public interface SuperUserCommands {

    String EXIT = "0";
    String REGISTER = "1";
    String LOGIN = "2";


    static void printUserCommands() {
        System.out.println();
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + REGISTER + " for register");
        System.out.println("please input " + LOGIN + " for login");
    }
}


