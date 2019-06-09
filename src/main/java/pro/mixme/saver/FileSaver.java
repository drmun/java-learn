package pro.mixme.saver;

import pro.mixme.message.Message;
import pro.mixme.message.MessageTemplate;

import java.io.*;

public class FileSaver implements Saver {

    private File file;

    public FileSaver(File file) {
        this.file = file;
    }

    @Override
    public String save(MessageTemplate message) throws IOException {

        try (Writer fileSave = new FileWriter(file, true)) {
            fileSave.write(String.valueOf(message));
            fileSave.flush();

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return "Message saved to file";
    }

}
