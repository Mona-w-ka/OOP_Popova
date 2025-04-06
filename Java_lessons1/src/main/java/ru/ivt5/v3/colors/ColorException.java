package ru.ivt5.v3.colors;

public class ColorException extends Exception {
    // Поле для хранения кода ошибки
    private final ColorErrorCode errorCode;

    // Конструктор, принимающий код ошибки
    public ColorException(ColorErrorCode errorCode) {
        super(errorCode.getErrorString());
        this.errorCode = errorCode;
    }

    // Геттер для получения кода ошибки
    public ColorErrorCode getErrorCode() {
        return errorCode;
    }
}
