package pro.mixme.message;

import pro.mixme.author.Author;

import java.util.Date;

public interface MessageTemplate {

    public void setAuthor(Author author);
    public void setDateTimeMessage(Date dateTimeMessage);
    public void setMessageText(String messageText);
}
