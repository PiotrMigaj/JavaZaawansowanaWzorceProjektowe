package pl.migibud.wzorceprojektowe.zadania.decorator.ex4;

public class TextMessage implements Message{

    private String msg;

    public TextMessage(String msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return this.msg;
    }
}
