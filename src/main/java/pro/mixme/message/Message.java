package pro.mixme.message;

import pro.mixme.author.Author;

import java.util.Date;

public class Message implements MessageTemplate{

    private Author author;
    private Date dateTimeMessage;
    private String messageText;


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Date getDateTimeMessage() {
        return dateTimeMessage;
    }

    public void setDateTimeMessage(Date dateTimeMessage) {
        this.dateTimeMessage = dateTimeMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }


    @Override
    public String toString() {
        return "Message{" +
                "author=" + author +
                ", dateTimeMessage=" + dateTimeMessage +
                ", messageText='" + messageText + '\'' +
                '}';
    }
}
