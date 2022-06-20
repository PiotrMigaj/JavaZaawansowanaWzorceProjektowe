package pl.migibud.wzorceprojektowe.zadania.command.ex1.command;

import pl.migibud.wzorceprojektowe.zadania.command.ex1.receiver.TextFile;

public class OpenTextFileCommand implements TextFileCommand {

    private TextFile textFile;

    public OpenTextFileCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
