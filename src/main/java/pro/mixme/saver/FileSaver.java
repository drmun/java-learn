package pro.mixme.saver;

import pro.mixme.message.Message;

import java.io.*;

public class FileSaver implements Saver {

    private File file;

    public FileSaver(File file) {
        this.file = file;
    }

    @Override
    public String save(Message message) throws IOException {

        try (Writer fileSave = new FileWriter(file, false)) {
            fileSave.write(message.getMessageInform());
            fileSave.flush();

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return "Message saved to file";
    }

}
