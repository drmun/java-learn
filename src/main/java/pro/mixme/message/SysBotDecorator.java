package pro.mixme.message;

public class SysBotDecorator {
    public String format (Message message){
        return message.toString()+"(@SysBot)";
    }
}
