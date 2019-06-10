package pro.mixme.message;

import pro.mixme.author.Author;

import java.util.Date;

public class SystemMessage extends MessageDecorator {

    public SystemMessage(MessageTemplate messageTemplate) {
        super(messageTemplate);

    }

    @Override
    public String toString() {
        return super.toString() + "(@-=SystemMessage=-)"; //Доп строка к сообщению бота
    }
}
