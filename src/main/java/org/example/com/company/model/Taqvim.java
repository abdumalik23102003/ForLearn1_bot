package org.example.com.company.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Taqvim {
    private String region;
    private String date;
    private String weekday;
    private Times times;

    @Override
    public String toString() {
        return
                "\nHudud : " + region + '\n' +
                "Sana : " + date + ", " +
                weekday + '\n' +
                times + '\n';
    }
}
