package org.example.com.company.bot;

import org.example.com.company.entity.MainUI;
import org.example.com.company.service.MainService;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class a1l2e3x4_bot extends TelegramLongPollingBot {
    public a1l2e3x4_bot() {
        super("6076590763:AAFrJyJ4_oqJgpqMvcAlDJHOl4giqD_bLUM");
    }

    @Override
    public void onUpdateReceived(Update update) {
//        USERS.add(new Client(update.getMessage().getContact().getFirstName(),
//                update.getMessage().getFrom().getUserName(),
//                update.getMessage().getContact().getPhoneNumber(),
//                update.getMessage().getContact().getUserId(),
//                Role.USER,
//                "menu"));
//        getClient(update.getMessage().getChatId()).setState("menu");
        if (update.hasMessage() && update.getMessage().hasText()) {
            MainUI.mainMenu(update, this);
        }
        MainService.extracted(update, this);
    }
    @Override
    public String getBotUsername() {
        return "@a1l2e3x4_bot";
    }
}
