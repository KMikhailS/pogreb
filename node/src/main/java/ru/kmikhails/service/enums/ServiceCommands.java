package ru.kmikhails.service.enums;

public enum ServiceCommands {
    HELP("/help"),
    REGISTRATION("/registration"),
    CANCEL("/cancel"),
    START("/start");

    private final String value;

    ServiceCommands(String cmd) {
        this.value = cmd;
    }

    @Override
    public String toString() {
        return value;
    }

    public static ServiceCommands fromValue(String value) {
        for (ServiceCommands command : ServiceCommands.values()) {
            if (command.value.equals((value))) {
                return command;
            }
        }
        return null;
    }
}
