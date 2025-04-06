package ru.ivt5.v3.colors;

public enum ColorErrorCode {
    WRONG_COLOR_STRING("Неверная строка цвета"),
    NULL_COLOR("Цвет не может быть null");

    private final String errorString;

    ColorErrorCode(String errorString) {
        this.errorString = errorString;
    }

    // Метод для получения описания ошибки
    public String getErrorString() {
        return errorString;
}
}

