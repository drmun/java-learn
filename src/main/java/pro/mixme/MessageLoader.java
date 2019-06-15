package pro.mixme;

import pro.mixme.author.Author;
import pro.mixme.message.Message;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

        Map<Author,List<Message>> resultAutorMessage;

        resultAutorMessage = messages
                .stream()
                .filter(message -> authors.contains(message.getAuthor()))
                .sorted(Comparator.comparing(Message::getDateTimeMessage))
                .collect(Collectors.groupingBy(Message::getAuthor));

        return resultAutorMessage;
    }

}
