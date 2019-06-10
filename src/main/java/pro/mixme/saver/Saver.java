package pro.mixme.saver;

import pro.mixme.message.Message;
import pro.mixme.message.MessageTemplate;

import java.io.IOException;

public interface Saver {

    String save(MessageTemplate message) throws IOException;

}
