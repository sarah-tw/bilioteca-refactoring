package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program {

    public static void main(String[] args) {
        while (true) {
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

            if (i1 == 1) {
                BookListCommand bookListCommand = new BookListCommand();
                bookListCommand.printBookList();
            } else if (i1 == 2) {
                CheckBookCommand checkBookCommand = new CheckBookCommand();
                checkBookCommand.checkBook(reader);
            } else if (i1 == 3) {
                CheckNumberCommand checkNumberCommand = new CheckNumberCommand();
                checkNumberCommand.checkNumber();
            } else if (i1 == 4) {
                MovieListCommand movieListCommand = new MovieListCommand();
                movieListCommand.printMovieList();
            } else if (i1 == 5) {
                LoginCommand loginCommand = new LoginCommand();
                loginCommand.login(reader);

            } else if (i1 == 9) {
                QuitCommand quitCommand = new QuitCommand();
                QuitCommand.quit();
                break;
            } else {
                ErrorInputCommand errorInputCommand = new ErrorInputCommand();
                ErrorInputCommand.errorInput();
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

