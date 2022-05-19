package pl.migibud.wzorceprojektowe.zadania.decorator.ex4;

public class Client {
    public static void main(String[] args) {

        Message m = new TextMessage("The <FORCE> is strong with this one!");
        System.out.println(m.getContent());

        Message mEscapeHtml = new HtmlEncodedMessage(m);
        System.out.println(mEscapeHtml.getContent());

    }
}
