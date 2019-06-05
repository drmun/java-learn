package pro.mixme;

import pro.mixme.saver.ConsoleSaver;
import pro.mixme.saver.FileSaver;
import pro.mixme.saver.Saver;

import java.io.IOException;

public class MessageController {

    private static final String message = "Hello world!";

    public String handleMessage(ConsoleSaver saver){
        return saver.save(message);
    }

    //Перегрузка метода
    public String handleMessage(FileSaver file) throws IOException{
        return file.save(message);
    }

}
