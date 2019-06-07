package pro.mixme.saver;

import pro.mixme.message.Message;

public class ConsoleSaver implements Saver {

    @Override
    public String save(Message message) {
        System.out.println(message.getLogMessage());
        return "message was saved";
    }

}
