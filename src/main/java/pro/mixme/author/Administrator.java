package pro.mixme.author;

import pro.mixme.message.AdminMessageDecorator;
import pro.mixme.message.Message;

import java.util.Date;

import static java.lang.System.currentTimeMillis;

public class Administrator implements Author {

    @Override
    public Message postMessage(String textMessage) {
        Message message = new Message();
        message.setAuthor(this);
        message.setMessageText(textMessage);
        message.setDateTimeMessage(new Date(currentTimeMillis()));
        return  new AdminMessageDecorator().format(message);
    }

}
