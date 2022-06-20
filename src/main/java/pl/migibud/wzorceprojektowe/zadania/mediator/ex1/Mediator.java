package pl.migibud.wzorceprojektowe.zadania.mediator.ex1;

public class Mediator {

    private static final String MESSAGE_PREFIX = "I love you, but ";

    public static String accommodate(String msg){
        return MESSAGE_PREFIX + msg;
    }

}
