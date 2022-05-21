package pl.migibud.wzorceprojektowe.zadania.bridge.ex4;

public class RpcApi implements MessageApi {
    @Override
    public void send(String message) {
        System.out.println(message + " was sent by RPC API");
    }
}
