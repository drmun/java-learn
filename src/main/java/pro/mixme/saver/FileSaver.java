package pro.mixme.saver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Writer;

public class FileSaver implements Saver {

    private File file;

    public FileSaver(File file) {
        this.file = file;
    }

    @Override
    public String save(String message) {

        try {
         //   if (file.exists()) {
                Writer writeFile = new FileWriter(file, false);
                writeFile.write(message);
                writeFile.flush();
         //   } else {
         //      throw new FileNotFoundException();
         ///   }


        } catch (Exception e) {
            e.printStackTrace();
            return "Error: message was'nt saved";
        }
        return "Message saved to file";
    }

}
