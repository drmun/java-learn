package pro.mixme;

import pro.mixme.author.Author;
import pro.mixme.message.Message;

import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;

public class MessageLoader {

    private List<Author> authors;

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
        this.authors = authors;
        return messages
                .stream()
                .filter(this::filterAuthors)
                .sorted(comparing(Message::getDateTimeMessage))
                .collect(groupingBy(Message::getAuthor));
}

    private boolean filterAuthors(Message message) {
        return authors.contains(message.getAuthor());
    }

}
