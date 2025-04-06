package ru.ivt5.iface;
import ru.ivt5.v3.colors.Color;
import ru.ivt5.v3.colors.ColorException;

public interface Colored {
    void setColor(Color color);
    int getColor();

    void setColor(String colorString) throws ColorException;
}

