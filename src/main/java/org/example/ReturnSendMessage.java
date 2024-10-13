package org.example;

import org.telegram.telegrambots.meta.api.objects.Update;

public class ReturnSendMessage {

    String returnMessage(Update update){
        return update.getMessage().getText();
    }
}
