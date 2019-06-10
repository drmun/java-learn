package pro.mixme;

import pro.mixme.author.Author;
import pro.mixme.message.Message;

import java.util.List;
import java.util.Map;

public class MessageLoader {

    /**
     * 1. Фильтрует сообщения по авторам из списка авторов
     * 2. Группирует сообщения по авторам
     * 3. Сортирует список сообщений автора по дате
     *
     * @param messages - список сообщений
     * @param authors - список авторов
     * @return Представление Автор:СписокСообщений
     */
    public Map<Author,List<Message>> showHistory(List<Message> messages, List<Author> authors) {

        // todo method body by javadoc with java streams

        return null;
    }

}
