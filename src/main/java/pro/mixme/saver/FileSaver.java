package pro.mixme.saver;

import java.io.File;

public class FileSaver implements Saver {

    private File file;

    public FileSaver(File file) {
        this.file = file;
    }

    @Override
    public String save(String message) {

        try {
            // todo save to file
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: message was'nt saved";
        }
        return "Message saved to file";
    }

}
