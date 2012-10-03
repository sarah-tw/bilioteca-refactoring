package main;

public enum MyCommand {
    BOOKLIST(1, new BookListCommand()), CHECKBOOK(2, new CheckBookCommand()),
    CHECKNUMBER(3, new CheckNumberCommand()), LOGIN(5, new LoginCommand()),
    ERRORINPUT(-1, new ErrorInputCommand()), MOVIELIST(4, new MovieListCommand()),
    QUIT(9, new QuitCommand());

    private int index;
    private Command command;

    MyCommand(int i, Command command) {
        this.index = i;
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public static MyCommand parseCommand(int i){
        for(MyCommand myCommand : MyCommand.values()){
            if(myCommand.index == i ){
                return myCommand;
            }
        }
        return ERRORINPUT;
    }




}
