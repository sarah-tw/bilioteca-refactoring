package main;

public class QuitCommand implements Command{
    public void excute() {
        System.out.println("Quitting...");
    }
}
