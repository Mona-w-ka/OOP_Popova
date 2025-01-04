package ru.ivt5.v3.v3.colors;


public enum ColorErrorCode {
    NULL_COLOR("null color"),
    WRONG_COLOR_STRING("wrong color");
    String errorString;

    ColorErrorCode(String errorString){this.errorString = errorString;}
    public String getErrorString() {return errorString;}
}
