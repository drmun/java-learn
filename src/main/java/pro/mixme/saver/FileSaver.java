package pro.mixme.saver;

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
    public String save(String message) throws IOException {

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
