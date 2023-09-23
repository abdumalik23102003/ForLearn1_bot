package org.example.com.company.entity;

import org.example.com.company.bot.a1l2e3x4_bot;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.example.com.company.util.Util.MAIN_SERVICE;

public class MainUI {
    public static void mainMenu(Update update, a1l2e3x4_bot bot) {
        MAIN_SERVICE.meeting(update, bot);
        MAIN_SERVICE.secondTime(update, bot);
        MAIN_SERVICE.thirdTime(update, bot);
        MAIN_SERVICE.timeForToday(update, bot);
        MAIN_SERVICE.timeForWeek(update, bot);
    }

}
