package pro.mixme.author;

import pro.mixme.author.access.Access;

public class Administrator implements Author {


    @Override
    public String postMessage() {
        return "i am admin";
    }
}
