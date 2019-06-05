package pro.mixme;

import org.junit.Before;
import org.junit.Test;
import pro.mixme.message.Message;
import pro.mixme.saver.ConsoleSaver;
import pro.mixme.saver.FileSaver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.*;

/**
 * @Before
 * Метод, помеченный аннотацией @Before, отрабатывает перед каждым тестом
 * В нем описывается общее для всех тестов поведение
 *
 * @After
 * Метод, помеченный аннотацией @After, отрабатывает после каждого теста
 * Как правило используется для обнуления состояний и очистки даннных
 *
 * @Test
 * Аннотацией @Test помечается метод теста.
 * Тестовый метод должен быть public void.
 * Существуют параметризованные тесты, это отдельная тема.
 * Методы класса org.junit.Assert проверяют результат выполнения.
 *
 * @Test(expected = IOException.class)
 * Если ожидается выброс исключения, к аннотации добавляется параметр
 */
public class MessageControllerTest {

    private MessageController messageController;
    private Message message;

    { //Блок инициализации объекта класса Message для проведения тестов
        message = new Message();
        message.setDateTimeMessage(LocalDateTime.of(2019, Month.JUNE,05,21,30));
        message.setUser("NotBadUser");
        message.setMessageText("Hello world");
    }

    @Before
    public void setUp() throws Exception {
        messageController = new MessageController(message);
    }

    @Test
    public void handleMessage_whenSaveToConsoleSaver()  {
        String expected = "message was saved";

        String result = messageController.handleMessage(new ConsoleSaver());

        assertEquals(expected, result);
    }

    @Test
    public void handleMessage_whenSaveToFile_successful()  {
        String expected = "Message saved to file";
        //Обработка исключения
        try {
            String result = messageController.handleMessage(new FileSaver(new File("str.txt")));
            assertEquals(expected, result);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: message was'nt saved");
        }
    }

    @Test (expected = IOException.class)
    public void handleMessage_whenSaveToFile_exception() throws IOException {
        File file = new File("text.txt");
        file.setReadOnly();
        messageController.handleMessage(new FileSaver(file));
    }
}