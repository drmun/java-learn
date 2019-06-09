package pro.mixme.author;

import pro.mixme.message.Message;
import pro.mixme.message.MessageTemplate;
import pro.mixme.message.SystemMessage;

import java.util.Date;

import static java.lang.System.currentTimeMillis;

public class SystemBot implements Author {

    @Override
    public MessageTemplate postMessage(String textMessage) {
        MessageTemplate message = new SystemMessage(new Message());
        message.setAuthor(this);
        message.setMessageText(textMessage);
        message.setDateTimeMessage(new Date(currentTimeMillis()));
        return message;
    }
}
