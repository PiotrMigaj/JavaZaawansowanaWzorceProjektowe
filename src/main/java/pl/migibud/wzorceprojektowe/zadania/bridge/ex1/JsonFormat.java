package pl.migibud.wzorceprojektowe.zadania.bridge.ex1;

public class JsonFormat extends Format {

    public JsonFormat(String text, Api api) {
        this.text = "{\"message\": \"" + text +"\"}";
        this.api = api;
    }

    @Override
    public void sendMessage() {
        api.send(this.text);
    }
}
