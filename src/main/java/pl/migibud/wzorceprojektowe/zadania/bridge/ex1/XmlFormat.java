package pl.migibud.wzorceprojektowe.zadania.bridge.ex1;

public class XmlFormat extends Format {

    public XmlFormat(String text,Api api) {
        this.text = "<message>" + text + "</message>";
        this.api = api;
    }

    @Override
    public void sendMessage() {
        this.api.send(this.text);
    }
}
