package pro.mixme.author;

import pro.mixme.message.Message;

import java.util.Date;

import static java.lang.System.currentTimeMillis;

public class User implements Author {

    @Override
    public String postMessage(String textMessage) {
        Message message = new Message();
        message.setAuthor(this);
        message.setMessageText(textMessage);
        message.setDateTimeMessage(new Date(currentTimeMillis()));
        return String.valueOf(message);
    }

}
