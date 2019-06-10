package pro.mixme.message;

public class AdminMessageDecorator {

    public String format (Message message){
        return message.toString().toUpperCase();
    }

}
