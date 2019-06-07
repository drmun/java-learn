package pro.mixme.author;

import pro.mixme.author.access.Access;

public class Author {
    public String longName,nickname;
    public boolean sendingMessage;
    @Override
    public String toString() {
        return "nickname='" + nickname;
    }
}
