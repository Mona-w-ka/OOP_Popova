package ru.ivt5.school;

public enum TrainingErrorCode {
    TRAINEE_WRONG_FIRSTNAME("Имя не может быть null или пустой строкой"),
    TRAINEE_WRONG_LASTNAME("Фамилия не может быть null или пустой строкой"),
    TRAINEE_WRONG_RATING("Оценка должна быть в интервале от 1 до 5");

    private final String message;

    TrainingErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}