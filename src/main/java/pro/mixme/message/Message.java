package pro.mixme.message;

import pro.mixme.author.Author;

import java.util.Date;

public class Message {
    private String author;
    private String dateTimeMessage;
    private String messageText;

    //Метод вывода строки с данными
    public String getLogMessage(){
            return dateTimeMessage + " " + author + ": " + messageText;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getDateTimeMessage() {
        return dateTimeMessage;
    }

    public void setDateTimeMessage(String dateTimeMessage) {
        this.dateTimeMessage = dateTimeMessage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
