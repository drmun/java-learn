package pro.mixme.message;

import pro.mixme.author.Author;
import pro.mixme.author.access.Access;

import java.time.LocalDateTime;

public class Message {
    private Author author;
    private LocalDateTime dateTimeMessage;

    public Message(Author author) {
        this.author = author;
    }

    //Метод вывода строки с данными

    public String getLogMessage(){
            return dateTimeMessage + " " + author + ": " + author.postMessage();
    }

    public LocalDateTime getDateTimeMessage() {
        return dateTimeMessage;
    }

    public void setDateTimeMessage(LocalDateTime dateTimeMessage) {
        this.dateTimeMessage = dateTimeMessage;
    }
}
