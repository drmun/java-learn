package pro.mixme.author;

import pro.mixme.author.access.Access;
import pro.mixme.message.Message;

import java.util.Date;

public class SystemBot implements Author {



    @Override
    public Message postMessage(String textMessage) {
        Date curentDateTime = new Date();
        Message message = new Message(?);
        message.setMessageText(textMessage);
        message.setDateTimeMessage(curentDateTime.toString());
        return message;
    }



}
