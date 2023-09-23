package org.example.com.company.model;

import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor

public class Times {
    private String tong_saharlik;
    private String quyosh;
    private String peshin;
    private String shom_iftor;
    private String hufton;

    @Override
    public String toString() {
        return  "tong-saharlik:  " + tong_saharlik + '\n' +
                "quyosh:         " + quyosh + '\n' +
                "peshin:         " + peshin + '\n' +
                "shom_iftor:     " + shom_iftor + '\n' +
                "hufton:         " + hufton + '\n';
    }
}
