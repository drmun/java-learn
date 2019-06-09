package pro.mixme.author;

import pro.mixme.message.AdminMessage;
import pro.mixme.message.Message;
import pro.mixme.message.MessageTemplate;

import java.util.Date;

import static java.lang.System.currentTimeMillis;

public class Administrator implements Author {

    @Override
    public MessageTemplate postMessage(String textMessage) {
        MessageTemplate message = new AdminMessage(new Message());
        message.setAuthor(this);
        message.setMessageText(textMessage);
        message.setDateTimeMessage(new Date(currentTimeMillis()));
        return message;
    }

}
