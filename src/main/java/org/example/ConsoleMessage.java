package org.example;

import org.telegram.telegrambots.meta.api.objects.Update;

public class ConsoleMessage {


    void ConsolePrintMessage(Update update){
        Long chatId = update.getMessage().getChatId();
        String text = update.getMessage().getText();
        String message = update.getMessage().getText();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(chatId).append("\n");
        stringBuilder.append(text).append("\n");
        stringBuilder.append(message).append("\n");

        System.out.println(stringBuilder.toString());
    }
}
