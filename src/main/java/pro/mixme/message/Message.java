package pro.mixme.message;

import java.time.LocalDateTime;

public class Message {
    private String messageText;
    private String user;
    private LocalDateTime dateTimeMessage;

    public String getMessageInform(){
        return dateTimeMessage+" "+user+": "+messageText;
    }
    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDateTime getDateTimeMessage() {
        return dateTimeMessage;
    }

    public void setDateTimeMessage(LocalDateTime dateTimeMessage) {
        this.dateTimeMessage = dateTimeMessage;
    }
}
