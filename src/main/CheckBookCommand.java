package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckBookCommand implements Command{

    public void excute() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Please enter the number of the book you wish to checkout: ");
        int i2 = 0;
        try {
            i2 = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            // Do you know what numbers are!!!
            System.out.println("Enter a valid integer!!");

        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println(" Thank You! Enjoy the book.");
                break;
            default:
                System.out.println("Sorry we don't have that book yet.");
        }
    }
}
