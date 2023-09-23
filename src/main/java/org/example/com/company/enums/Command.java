package org.example.com.company.enums;

import lombok.Getter;
@Getter
public enum Command {
    START("/start"),
    HELP("/help"),
    FOR_TODAY("bugungi"),
    PRAYER_TIMES("\uD83D\uDD4B namoz vaqtlari"),
    SETTINGS("⚙️ sozlamalar"),
    CONTACT_ADMIN("\uD83D\uDCDE admin bilan aloqa"),
    FOR_WEEK("shu hafta"),
    FOR_MONTH("shu Oy uchun"),
    BACK("\uD83D\uDD19 ortga"),
    FOR_YEAR("shu yil uchun"),
    CHOOSE_DATE("sanani tanlash");
    private final String var;
    Command(String var) { this.var = var; }
}
