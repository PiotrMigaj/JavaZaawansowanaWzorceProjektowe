package pl.migibud.wzorceprojektowe.zadania.decorator.ex4;

import org.apache.commons.lang3.StringEscapeUtils;

public class HtmlEncodedMessage extends MessageDecorator{
    public HtmlEncodedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(this.message.getContent());
    }
}
