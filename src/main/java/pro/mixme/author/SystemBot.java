package pro.mixme.author;


import pro.mixme.message.Message;

import java.util.Date;

public class SystemBot implements Author {
    private String nikename = "SystemBot";

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
