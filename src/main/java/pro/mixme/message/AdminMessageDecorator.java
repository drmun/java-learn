package pro.mixme.message;

public class AdminMessageDecorator {

    public Message format (Message message){
        message.setMessageText(message.getMessageText()+"(@Admin)");
        return message;
    }

}
