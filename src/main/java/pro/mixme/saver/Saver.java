package pro.mixme.saver;

import pro.mixme.message.Message;

import java.io.IOException;

public interface Saver {

    String save(Message message) throws IOException;

}
