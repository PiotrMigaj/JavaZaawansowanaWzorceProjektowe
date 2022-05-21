package pl.migibud.wzorceprojektowe.zadania.bridge.ex4;

public class Main {
    public static void main(String[] args) {

        Format message = new XmlFormat("my text",new RestApi());
        message.sendMessage();

    }
}
