package pro.mixme.saver;

import pro.mixme.message.Message;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileSaver implements Saver {

    private File file;

    public FileSaver(File file) {
        this.file = file;
    }

    @Override
    public String save(Message message) throws IOException {

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
