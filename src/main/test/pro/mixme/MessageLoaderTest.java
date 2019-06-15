package pro.mixme;

import org.junit.Before;
import org.junit.Test;
import pro.mixme.author.Administrator;
import pro.mixme.author.Author;
import pro.mixme.author.SystemBot;
import pro.mixme.author.User;
import pro.mixme.message.Message;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MessageLoaderTest {
    private List<Author> authors;
    private List<Message> messages;
    private MessageLoader messageLoader;

    @Before
    public void setUp() throws Exception {
        messageLoader=new MessageLoader();

        Administrator administrator = new Administrator();
        User user = new User();
        SystemBot systemBot = new SystemBot();

        authors = new ArrayList<Author>();
        authors.addAll(Arrays.asList(user,administrator,systemBot));

        messages = new ArrayList<Message>();
        for (int i=0;i<10;i++,Thread.sleep(1000)){

            messages.add(user.postMessage("Hello #"+i));
            messages.add(administrator.postMessage("Admin #"+i));
            messages.add(systemBot.postMessage("System #"+i));
        }

    }

    @Test
    public void showHistoryTest() {
        messageLoader.showHistory(messages,authors)
                .forEach(((author, messages) -> System.out.format("Автор %s: %s\n",author,messages) ));


    }
}