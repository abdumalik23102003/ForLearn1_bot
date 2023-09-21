package org.example.com.company.util;

import org.example.com.company.enums.Command;

public class Buttons {
    public static String[][] firstWindow = {
            {Command.PRAYER_TIMES.getVar(), Command.SETTINGS.getVar()},
            {Command.CONTACT_ADMIN.getVar()}
    };
    public static String[][] secondWindow = {
            {Command.FOR_TODAY.getVar(), Command.FOR_TOMORROW.getVar()},
            {Command.FOR_MONTH.getVar(), Command.FOR_YEAR.getVar()},
            {Command.CHOOSE_DATE.getVar(), Command.BACK.getVar()}
    };
}
