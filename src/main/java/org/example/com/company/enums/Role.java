package org.example.com.company.enums;

import lombok.Getter;

@Getter
public enum Role {
    ADMIN("admin"),
    USER("user");
    private final String var;

    Role(String var) {
        this.var = var;
    }
}
