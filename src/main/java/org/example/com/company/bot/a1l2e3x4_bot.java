package org.example.com.company.bot;

import org.example.com.company.entity.MainUI;
import org.example.com.company.enums.CallBackData;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendContact;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class a1l2e3x4_bot extends TelegramLongPollingBot {
    public a1l2e3x4_bot() {
        super("6076590763:AAFrJyJ4_oqJgpqMvcAlDJHOl4giqD_bLUM");
    }

    @Override
    public void onUpdateReceived(Update update) {



        if (update.hasMessage() && update.getMessage().hasText()) {
            MainUI.mainMenu(update, this);
//             Handle incoming text messages
            Message message = update.getMessage();
            long chatId = message.getChatId();

            // Create an inline keyboard markup with a callback
            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
            List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
            List<InlineKeyboardButton> row = new ArrayList<>();
            InlineKeyboardButton button = new InlineKeyboardButton();
            button.setText("Click me");
            button.setCallbackData("callback_data_here"); // This is the callback data you want to send
            row.add(button);
            keyboard.add(row);
            inlineKeyboardMarkup.setKeyboard(keyboard);

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("Hello, choose an option:");
            sendMessage.setReplyMarkup(inlineKeyboardMarkup);

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }
        if (update.hasCallbackQuery()) {
            System.out.println("srghrfgf");
            // This update is a callback query triggered by the user clicking a button
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String callbackData = callbackQuery.getData();
            long chatId2 = callbackQuery.getMessage().getChatId();

            // Process the callback data as needed
            if (callbackData.equals("callback_data_here")) {
                // Perform some action based on the callback data
                // For example, send a response message
                SendMessage sendMessage2 = new SendMessage();
                sendMessage2.setChatId(chatId2);
                sendMessage2.setText("You clicked the button with callback data: " + callbackData);

                try {
                    execute(sendMessage2);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }else if (callbackData.equals(CallBackData.CALLBACK_CONTACT.getValue())) {
                // Perform some action based on the callback data
                // For example, send a response message
                SendContact contact = new SendContact();
                contact.setChatId(1176805889L);
                contact.setFirstName("Abdumalik");
                contact.setPhoneNumber("+998901379546");
//                SendMessage sendMessage2 = new SendMessage();
//                sendMessage2.setChatId(chatId2);
//                sendMessage2.setText("You clicked the button with callback data: " + callbackData);

                try {
                    execute(contact);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
        // Handle other types of updates (e.g., text messages) as needed

    }

    @Override
    public String getBotUsername() {
        return "@a1l2e3x4_bot";
    }
}
