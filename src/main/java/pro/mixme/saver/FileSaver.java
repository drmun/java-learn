package pro.mixme.saver;

import java.io.*;

public class FileSaver implements Saver {

    private File file;

    public FileSaver(File file) {
        this.file = file;
    }

    @Override
    public String save(String message) throws IOException {

        try (Writer fileSave = new FileWriter(file, false)) {
            fileSave.write(message);
            fileSave.flush();

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return "Message saved to file";
    }

}
