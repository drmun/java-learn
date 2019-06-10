package pro.mixme.message;

public class AdminMessage extends MessageDecorator {
    public AdminMessage(MessageTemplate messageTemplate) {
        super(messageTemplate);
    }

    @Override
    public void setMessageText(String messageText) {
        super.setMessageText(messageText.toUpperCase()); //Сообщения админа в верхнем регистре
    }


}
