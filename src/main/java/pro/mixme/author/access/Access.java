package pro.mixme.author.access;

import pro.mixme.author.Author;

public class Access {
//Проверка доступа к написанию сообщения
    public static boolean checkMessageAccess (Author author){
        return author.sendingMessage;
    }
}
