package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


public class App{
    static private final String bottoken = "7572347758:AAGKyrEaq6WHyzfQANIBly-5ygDy5dRdwcA";
    public static void main( String[] args ) throws TelegramApiException {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new Bot(bottoken));
    }
}
