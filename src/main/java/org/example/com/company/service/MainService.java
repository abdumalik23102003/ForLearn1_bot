package org.example.com.company.service;

import org.example.com.company.bot.a1l2e3x4_bot;
import org.example.com.company.enums.CallBackData;
import org.example.com.company.enums.Command;
import org.telegram.telegrambots.meta.api.methods.send.SendContact;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.example.com.company.util.Buttons.firstWindow;
import static org.example.com.company.util.Buttons.secondWindow;
import static org.example.com.company.util.Util.TASK_SERVICE;

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

    public void meeting(Update update, a1l2e3x4_bot bot) {
        if (update.getMessage().getText().equals(Command.START.getVar())) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(update.getMessage().getChatId());
            sendMessage.setText(update.getMessage().getFrom().getFirstName() + " welcome to @a1l2e3x4_bot");
            try {
                bot.execute(sendMessage);
                firstTime(update, bot);
            } catch (TelegramApiException e) {
                logger.severe(e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public void firstTime(Update update, a1l2e3x4_bot bot) {
        if (update.getMessage().getText().equals(Command.START.getVar())) {
            sameCode(update, bot, firstWindow);
        }
    }

    public static void extracted(Update update, a1l2e3x4_bot bot) {
        if (update.hasCallbackQuery()) {
            System.out.println("srghrfgf");
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String callbackData = callbackQuery.getData();
            long chatId2 = callbackQuery.getMessage().getChatId();
            if (callbackData.equals(CallBackData.CALLBACK_CONTACT.getValue())) {
                System.out.println("etddd");
                SendContact contact = new SendContact();
                contact.setChatId(chatId2);
                contact.setFirstName("Abdumalik");
                contact.setPhoneNumber("+998901379546");
                try {
                    bot.execute(contact);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void secondTime(Update update, a1l2e3x4_bot bot) {
        if (update.getMessage().getText().equals(Command.PRAYER_TIMES.getVar())) {
            sameCode(update, bot, secondWindow);
        }
    }

    public void thirdTime(Update update, a1l2e3x4_bot bot) {
        if (update.getMessage().getText().equals(Command.CONTACT_ADMIN.getVar())) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setText("\uD83D\uDCAC BOG'ANISH TURINI TANLANG:");
            sendMessage.setChatId(update.getMessage().getChatId());
            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
            List<InlineKeyboardButton> td = new ArrayList<>();
            InlineKeyboardButton inlineKeyboardButtonTELG = new InlineKeyboardButton();
            inlineKeyboardButtonTELG.setText("telegram");
            inlineKeyboardButtonTELG.setUrl("https://t.me/ABDUMALIK_2233");
            inlineKeyboardButtonTELG.setCallbackData(CallBackData.CALLBACK_TELEGRAM.getValue());

            InlineKeyboardButton inlineKeyboardButtonCONT = new InlineKeyboardButton();

            inlineKeyboardButtonCONT.setText("kontakt orqali");
            inlineKeyboardButtonCONT.setCallbackData(CallBackData.CALLBACK_CONTACT.getValue());


            td.add(inlineKeyboardButtonTELG);
            td.add(inlineKeyboardButtonCONT);
            List<List<InlineKeyboardButton>> tr = new ArrayList<>();
            tr.add(td);

            inlineKeyboardMarkup.setKeyboard(tr);
            sendMessage.setReplyMarkup(inlineKeyboardMarkup);
            try {
                bot.execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }
    }

    public void timeForToday(Update update, a1l2e3x4_bot bot) {
        if (update.getMessage().getText().equals(Command.FOR_TODAY.getVar())) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setText(TASK_SERVICE.taskForToday());
            sendMessage.setChatId(update.getMessage().getChatId());
            try {
                bot.execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }
    }

    public void timeForWeek(Update update, a1l2e3x4_bot bot) {
        if (update.getMessage().getText().equals(Command.FOR_WEEK.getVar())) {
//            SendDocument sendDocument = new SendDocument();
//            sendDocument.setChatId(update.getMessage().getChatId());
//            sendDocument.setDocument(TASK_SERVICE.taskForWeek());
//            sendDocument.setDocument( new InputFile("C:\\Users\\ABDUMALIK\\OneDrive\\Desktop\\demoForUrlLearn\\ForWeek.txt"));
//            sendDocument.setCaption("weekly");
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(update.getMessage().getChatId());
            sendMessage.setText(TASK_SERVICE.taskForWeek());
            try {
//                bot.execute(sendDocument);
                bot.execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }
    }

    private void sameCode(Update update, a1l2e3x4_bot bot, String[][] someWindow) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId());
        ReplyKeyboardMarkup replyKeyboardMarkup = GetKeyboard(someWindow);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        sendMessage.setText("Menu");
        try {
            bot.execute(sendMessage);
        } catch (TelegramApiException e) {
            logger.severe(e.getMessage());
            e.printStackTrace();
        }
    }
}
