package ru.ivt5.v2;
import ru.ivt5.iface.Colored;
import ru.ivt5.iface.Resizable;
import ru.ivt5.v3.colors.Color;
import ru.ivt5.v3.colors.ColorException;

public class Circle extends Figure implements Colored, Resizable {
    private int radius;
    private Color color;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y);
        this.radius = radius;
        this.color = color;
    }


    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public void setColor(String colorString) throws ColorException {

    }

    @Override
    public void resize(double ratio) {
        this.radius *= ratio;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

