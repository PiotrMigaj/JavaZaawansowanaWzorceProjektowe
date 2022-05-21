package pl.migibud.wzorceprojektowe.zadania.bridge.ex1;

public class RpcApi implements Api {
    @Override
    public void send(String formattedMsg) {
        System.out.println(formattedMsg + " została przesłana za pomocą Rpc Api");
    }
}
