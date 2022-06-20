package pl.migibud.wzorceprojektowe.zadania.command.ex1.receiver;

public class TextFile {

    private final String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open(){
        return "opening file: " + name;
    }

    public String save(){
        return "saving file: " + name;
    }


}
