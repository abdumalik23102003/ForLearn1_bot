package org.example.com.company.bot;

import org.example.com.company.entity.MainUI;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class a1l2e3x4_bot extends TelegramLongPollingBot {
    public a1l2e3x4_bot() {super("6076590763:AAFrJyJ4_oqJgpqMvcAlDJHOl4giqD_bLUM");}

    @Override
    public void onUpdateReceived(Update update) {
        MainUI.mainMenu(update, this);
    }

    @Override
    public String getBotUsername() {
        return "@a1l2e3x4_bot";
    }
}
