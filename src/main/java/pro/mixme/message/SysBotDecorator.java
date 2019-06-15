package pro.mixme.message;

public class SysBotDecorator {
    public Message format (Message message){
        message.setMessageText(message.getMessageText()+"(@SysBot)");
        return message;
    }
}
