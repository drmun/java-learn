package pro.mixme.saver;

import java.io.*;

public class FileSaver implements Saver {

    private File file;

    public FileSaver(File file) {
        this.file = file;
    }

    @Override
    public String save(String message) {

        try (Writer fileSave = new FileWriter(file, false)) {
            fileSave.write(message);
            fileSave.flush();

        } catch (IOException e) {
            e.printStackTrace();
            return "Error: message was'nt saved";
        }
        return "Message saved to file";
    }

}
