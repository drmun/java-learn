package pro.mixme.author;


import pro.mixme.message.Message;
import pro.mixme.message.MessageTemplate;

public interface Author {

    MessageTemplate postMessage(String message);
}
