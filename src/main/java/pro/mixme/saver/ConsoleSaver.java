package pro.mixme.saver;

public class ConsoleSaver implements Saver {

    @Override
    public String save(String message) {
        System.out.println(message);
        return "message was saved";
    }

}
