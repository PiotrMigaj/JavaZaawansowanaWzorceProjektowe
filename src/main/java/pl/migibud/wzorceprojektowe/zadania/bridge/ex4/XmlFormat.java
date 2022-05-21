package pl.migibud.wzorceprojektowe.zadania.bridge.ex4;

public class XmlFormat extends Format {

    public XmlFormat(String text, MessageApi api) {
        this.text = "<message>" + text + "</message>";
        this.api = api;
    }

    @Override
    public void sendMessage() {
        api.send(text);
    }
}
