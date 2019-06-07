package pro.mixme.author;

public class User implements Author {

    @Override
    public String postMessage() {
        return "i am user";
    }
}
