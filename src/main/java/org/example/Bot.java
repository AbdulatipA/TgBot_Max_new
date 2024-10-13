package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    static private final LoggerMessage consoleMessage = new LoggerMessage();
    static private final ReturnSendMessage returnSendMessage = new ReturnSendMessage();

    public Bot(String bottoken) {
        super(bottoken);
    }

    @Override
    public String getBotUsername() {
        return "tgBot_maxLesson_bot";
    }

    @Override
    public void onUpdateReceived(Update update) {
        consoleMessage.ConsolePrintMessage(update);
        String result = returnSendMessage.returnMessage(update);
        sendMessage(result, update);
    }

    void sendMessage(String message, Update update) {
        SendMessage sendMessage = new SendMessage();
        if (update.hasMessage()) {
            sendMessage.setChatId(update.getMessage().getChatId());
            sendMessage.setText(message);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

