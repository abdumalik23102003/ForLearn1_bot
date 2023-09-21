package org.example.com.company.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.com.company.enums.Role;
import org.telegram.telegrambots.meta.api.objects.Contact;
import org.telegram.telegrambots.meta.api.objects.Update;

@Getter
@Setter
@RequiredArgsConstructor

public class Client {
    private String firstName;
    private String nickName;
    private String phoneNumber;
    private Long chatId;
    private Role role;
    private String state;

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", chatId=" + chatId +
                ", role=" + role +
                '}';
    }

    public Client(String firstName, String nickName, String phoneNumber, Long chatId, Role role, String state) {
        this.firstName = firstName;
        this.nickName = nickName;
        this.phoneNumber = phoneNumber;
        this.chatId = chatId;
        this.role = role;
        this.state = state;
    }
    public static Contact getContact(Update update) {
        return (update.getMessage().getChatId() == 1176805889) ? update.getMessage().getContact() : null;
    }
}
