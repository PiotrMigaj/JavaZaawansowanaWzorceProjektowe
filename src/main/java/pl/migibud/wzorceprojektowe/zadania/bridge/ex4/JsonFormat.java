package pl.migibud.wzorceprojektowe.zadania.bridge.ex4;

public class JsonFormat extends Format {

    public JsonFormat(String text, MessageApi api) {
        this.text=this.text = "{\"message\": \"" + text +"\"}";
        this.api = api;
    }

    @Override
    public void sendMessage() {
        api.send(text);
    }
}
