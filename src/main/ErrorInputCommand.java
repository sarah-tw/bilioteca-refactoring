package main;

public class ErrorInputCommand implements Command {
    public void excute() {
        System.out.println("Enter a valid integer!!");
    }
}
