package pro.mixme.saver;

import java.io.IOException;

public interface Saver {

    String save(String message) throws IOException;

}
