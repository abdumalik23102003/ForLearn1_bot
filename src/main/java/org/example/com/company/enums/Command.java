package org.example.com.company.enums;

public enum Command {
    START("/start"),
    HELP("/help");
    private final String var;
    Command(String var) { this.var = var; }

    public String getVar() {
        return var;
    }
}
