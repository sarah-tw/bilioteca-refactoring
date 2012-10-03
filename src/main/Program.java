package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program {

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printMenuList();

            InputStreamReader inputStream = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStream);
            int i1 = 0;
            try {
                String value = reader.readLine();
                i1 = Integer.parseInt(value);
            } catch (Exception e) {
                // Do you know what numbers are!!!
                System.out.println("Enter a valid integer!!");
            }
            Command command;
            if (i1 == 1) {
                command = new BookListCommand();
                command.excute();
            } else if (i1 == 2) {
                command = new CheckBookCommand();
                command.excute();
            } else if (i1 == 3) {
                command = new CheckNumberCommand();
                command.excute();
            } else if (i1 == 4) {
                command = new MovieListCommand();
                command.excute();
            } else if (i1 == 5) {
                command = new LoginCommand();
                command.excute();

            } else if (i1 == 9) {
                command = new QuitCommand();
                isRun = false;
                command.excute();
            } else {
                command = new ErrorInputCommand();
                command.excute();
            }
        }
    }

    private static void printMenuList() {
        System.out.println("**********************************************************");
        System.out.println("* Welcome to The Bangalore Public Library System - Biblioteca *");
        System.out.println("**********************************************************");
        System.out.println("*                Menu                                    *");
        System.out.println("*         =====================                          *");
        System.out.println("*         1. List Book Catalog                           *");
        System.out.println("*         2. Check out Book                              *");
        System.out.println("*         3. Check Library Number                        *");
        System.out.println("*         4. Movie Listing                               *");
        System.out.println("*         5. Login                                       *");
        System.out.println("*         9. Exit                                        *");
        System.out.println("**********************************************************");
        System.out.println("Your Selection: ");
    }


}

