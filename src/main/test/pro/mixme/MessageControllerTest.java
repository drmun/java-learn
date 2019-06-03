package pro.mixme;

import org.junit.Before;
import org.junit.Test;
import pro.mixme.saver.ConsoleSaver;

import static org.junit.Assert.*;

public class MessageControllerTest {

    private MessageController messageController;

    /**
     * Метод, помеченный аннотацией @Before, отрабатывает перед каждым тестом
     */
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
        // todo написать тест
    }

    @Test(expected = Exception.class)
    public void handleMessage_whenSaveToFile_exception() {
        // todo написать тест
    }
}