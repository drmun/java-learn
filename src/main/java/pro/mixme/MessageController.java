package pro.mixme;

import pro.mixme.saver.Saver;

public class MessageController {

    private static final String message = "Hello world!";

    public String handleMessage(Saver saver) {

        return saver.save(message);
    }

}
