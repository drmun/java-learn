package pro.mixme.saver;

import java.io.*;

public class FileSaver implements Saver {

    private File file;

    public FileSaver(File file) {
        this.file = file;
    }

    @Override
    public String save(String message) {
        Writer fileSave = new FileWriter(file, true);
        try () {

           // Writer fileSave = new FileWriter(file, true);
            fileSave.write(message);
            fileSave.flush();
            fileSave.
        } catch (IOException e) {
            e.printStackTrace();
            return "Error: message was'nt saved";
        } finally {
            fileSave.close();
        }
        return "Message saved to file";
    }

}
