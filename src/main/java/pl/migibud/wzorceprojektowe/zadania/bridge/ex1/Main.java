package pl.migibud.wzorceprojektowe.zadania.bridge.ex1;

public class Main {
    public static void main(String[] args) {

        Format format = new JsonFormat("Hello",new RestApi());
        format.sendMessage();

    }
}
