package org.example.com.company.enums;

import lombok.Getter;

@Getter
public enum CallBackData {
    CALLBACK_TELEGRAM("telegram"),
    CALLBACK_CONTACT("contact"),
    CALLBACK_SETTINGS("settings"),
    CALLBACK_UP_FROM("up_from"),
    CALLBACK_UP_TO("up_to"),
    CALLBACK_BOTTOM_FROM("bottom_from"),
    CALLBACK_BOTTOM_TO("bottom_to"),
    CALLBACK_CURR_FROM("curr_from_"),
    CALLBACK_CURR_TO("curr_to_"),
    CALLBACK_FROM("from"),
    CALLBACK_TO("to");
    private final String value;

    CallBackData(String value) {
        this.value = value;
    }
}
