package pl.migibud.wzorceprojektowe.zadania.command.ex1.invoker;

import pl.migibud.wzorceprojektowe.zadania.command.ex1.command.TextFileCommand;

public class TextFileCommandExecutor {

    public String executeCommand(TextFileCommand textFileCommand){
        return textFileCommand.execute();
    }



}
