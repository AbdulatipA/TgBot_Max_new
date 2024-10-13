package org.example;

import org.telegram.telegrambots.meta.api.objects.Update;

public class LoggerMessage {


    static private final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LoggerMessage.class.getName());

    void ConsolePrintMessage(Update update){
        Long chatId = update.getMessage().getChatId();
        String name = update.getMessage().getFrom().getUserName();
        String message = update.getMessage().getText();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("chatId: ").append(chatId).append("\n");
        stringBuilder.append("name: ").append(name).append("\n");
        stringBuilder.append("message: ").append(message).append("\n");
        stringBuilder.append("\n");
        log.info(stringBuilder.toString());
    }
}
