package pro.mixme;

import pro.mixme.message.Message;
import pro.mixme.message.MessageTemplate;
import pro.mixme.saver.ConsoleSaver;
import pro.mixme.saver.FileSaver;

import java.io.IOException;

public class MessageController {
    private MessageTemplate message;
   // private static final String message = "Hello world!";

    //Конструктор принимает объект класса Message
    public MessageController (MessageTemplate message){
        this.message = message;
    }

    public String handleMessage(ConsoleSaver saver){

        return saver.save(message);
    }

    //Перегрузка метода
    public String handleMessage(FileSaver file) throws IOException{
        return file.save(message);
    }

}
