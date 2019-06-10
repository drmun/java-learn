package pro.mixme;

import pro.mixme.saver.ConsoleSaver;
import pro.mixme.saver.FileSaver;

import java.io.IOException;

public class MessageController {
    private String message;
   // private static final String message = "Hello world!";

    //Конструктор принимает объект класса Message
    public MessageController (String message){
        this.message = message;
    }

    public String handleMessage(ConsoleSaver saver){

        return (String) saver.save(message);
    }

    //Перегрузка метода
    public String handleMessage(FileSaver file) throws IOException{
        return file.save(message);
    }

}
