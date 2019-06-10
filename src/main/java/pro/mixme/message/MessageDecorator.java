package pro.mixme.message;

import pro.mixme.author.Author;

import java.util.Date;

public abstract class MessageDecorator implements MessageTemplate {
    private MessageTemplate messageTemplate;


    public MessageDecorator(MessageTemplate messageTemplate) {
        this.messageTemplate = messageTemplate;
    }

    @Override
    public void setAuthor(Author author) {
        messageTemplate.setAuthor(author);
    }

    @Override
    public void setDateTimeMessage(Date dateTimeMessage) {
        messageTemplate.setDateTimeMessage(dateTimeMessage);
    }

    @Override
    public void setMessageText(String messageText) {
        messageTemplate.setMessageText(messageText);
    }

    @Override
    public String toString() {
        return messageTemplate.toString();
    }
}
