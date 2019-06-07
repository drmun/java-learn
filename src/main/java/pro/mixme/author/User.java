package pro.mixme.author;

import pro.mixme.message.Message;

import java.util.Date;

public class User implements Author {
    private String nikename;

    public User(String nikename) {
        this.nikename = nikename;
    }

    @Override
    public Message postMessage(String textMessage) {
        Message message = new Message();
        message.setMessageText(textMessage);
        Date currentDateTime = new Date();
        message.setDateTimeMessage(currentDateTime.toString());
        message.setAuthor(nikename);
        return message;
    }

}
