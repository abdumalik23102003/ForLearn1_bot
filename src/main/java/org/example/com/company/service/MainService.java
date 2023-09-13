package org.example.com.company.service;

import org.example.com.company.bot.a1l2e3x4_bot;
import org.example.com.company.enums.Command;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.example.com.company.repo.DemoRepo.firstWindow;

public class MainService {
    public static Logger logger = Logger.getLogger(MainService.class.getName());

    public static ReplyKeyboardMarkup GetKeyboard(String[][] s) {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> list = new ArrayList<>();
        for (String[] strings : s) {
            KeyboardRow row = new KeyboardRow();
            for (String string : strings) {
                KeyboardButton button = new KeyboardButton();
                button.setText(string);
                row.add(button);
            }
            list.add(row);
        }
        markup.setKeyboard(list);
        markup.setResizeKeyboard(true);
        return markup;
    }

    public void firstTime(Update update, a1l2e3x4_bot bot) {
        if (update.getMessage().getText().equals(Command.START.getVar())) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(update.getMessage().getChatId());
            sendMessage.setText("@" + update.getMessage().getFrom().getUserName() + " welcome to @a1l2e3x4_bot");
            ReplyKeyboardMarkup replyKeyboardMarkup = GetKeyboard(firstWindow);
            sendMessage.setReplyMarkup(replyKeyboardMarkup);
            try {
                bot.execute(sendMessage);
            } catch (TelegramApiException e) {
                logger.severe(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
