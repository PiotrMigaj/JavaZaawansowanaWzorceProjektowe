package pl.migibud.wzorceprojektowe.zadania.decorator.ex4;

public abstract class MessageDecorator implements Message {

    Message message;

    public MessageDecorator(Message message) {
        this.message = message;
    }
}
