package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {
    static private final ConsoleMessage consoleMessage = new ConsoleMessage();

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
    }
}
