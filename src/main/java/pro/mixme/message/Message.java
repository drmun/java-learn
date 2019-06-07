package pro.mixme.message;

import pro.mixme.author.Author;
import pro.mixme.author.access.Access;

import java.time.LocalDateTime;

public class Message {
    private String messageText;
    private Author author;
    private LocalDateTime dateTimeMessage;

    public Message(Author author) {
        this.author = author;
    }

    //Метод вывода строки с данными

    public String getLogMessage(){
        if (Access.checkMessageAccess(author)) {
            return dateTimeMessage + " " + author + ": " + messageText;
        }else{
            return dateTimeMessage + " " + author + ": Message BAN!!!";
        }
    }
    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public LocalDateTime getDateTimeMessage() {
        return dateTimeMessage;
    }

    public void setDateTimeMessage(LocalDateTime dateTimeMessage) {
        this.dateTimeMessage = dateTimeMessage;
    }
}
