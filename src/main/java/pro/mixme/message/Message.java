package pro.mixme.message;

import pro.mixme.author.Author;

import java.util.Date;

public class Message {
    private Author author;
    private String dateTimeMessage;
    public Date date;
    private String messageText;
    public Message(Author author) {
        this.author = author;
        date = new Date();
    }

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
}
