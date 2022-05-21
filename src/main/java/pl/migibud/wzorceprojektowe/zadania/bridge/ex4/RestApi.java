package pl.migibud.wzorceprojektowe.zadania.bridge.ex4;

public class RestApi implements MessageApi {
    @Override
    public void send(String message) {
        System.out.println(message + " was sent by Rest API");
    }
}
