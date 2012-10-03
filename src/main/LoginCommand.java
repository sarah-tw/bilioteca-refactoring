package main;

import java.io.BufferedReader;

public class LoginCommand {
    public void login(BufferedReader reader) {
        clearLogin();
        System.out.println("Enter your library number");
        try {
            String libraryNumber = reader.readLine();
            if (validLibraryNumber(libraryNumber)) {
                try {
                    System.out.println("Enter your Password: ");
                    String password = reader.readLine();
                    if (validPassword(password)) {
                        CheckNumberCommand.loggedIn = true;
                        CheckNumberCommand.savedLibraryNumber = libraryNumber;
                    }
                } catch (Exception e) {

                }
            }
        } catch (Exception e) {

        }
    }

    private static void clearLogin() {
        CheckNumberCommand.loggedIn = false;
        CheckNumberCommand.savedLibraryNumber = "";
    }

    private static boolean validLibraryNumber(String libraryNumber) {
        return libraryNumber.matches("\\d{3}-\\d{4}");
    }

    private static boolean validPassword(String password) {
        return "bhaisahab".equals(password);
    }
}
