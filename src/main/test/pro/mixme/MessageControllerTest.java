package pro.mixme;

import org.junit.Before;
import org.junit.Test;
import pro.mixme.saver.ConsoleSaver;
import pro.mixme.saver.FileSaver;

import java.io.File;
import java.io.FileNotFoundException;

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

    @Before
    public void setUp() throws Exception {
        messageController = new MessageController();
    }

    @Test
    public void handleMessage_whenSaveToConsoleSaver() {
        String expected = "message was saved";

        String result = messageController.handleMessage(new ConsoleSaver());

        assertEquals(expected, result);
    }

    @Test
    public void handleMessage_whenSaveToFile_successful() {
        String expected = "Message saved to file";

        String result = messageController.handleMessage(new FileSaver(new File("str.txt")));

        assertEquals(expected, result);
    }

    @Test// (expected = Exception.class)
    public void handleMessage_whenSaveToFile_exception() {
        String expected = "Error: message was'nt saved";

        String result = messageController.handleMessage(new FileSaver(new File("com/ru/text.txt")));

        assertEquals(expected, result);
    }
}