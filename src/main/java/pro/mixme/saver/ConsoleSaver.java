package pro.mixme.saver;

import pro.mixme.message.Message;
import pro.mixme.message.MessageTemplate;

public class ConsoleSaver implements Saver {

    @Override
    public String save(MessageTemplate message) {
        System.out.println(message);
        return "message was saved";
    }

}
