package pro.mixme.author;

import pro.mixme.author.access.Access;

public class SystemBot implements Author {


    @Override
    public String postMessage() {
        return "i am sysBot";
    }
}
