package ru.ivt5.v2;
import ru.ivt5.iface.Colored;
import ru.ivt5.iface.Stretchable;
import ru.ivt5.v3.colors.Color;
import ru.ivt5.v3.colors.ColorException;

public class Rectangle extends Figure implements Colored, Stretchable {
    private int width;
    private int height;
    private Color color;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setColor(int color) {

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
        this.width *= ratio;
        this.height *= ratio;
    }

    @Override
    public void stretch(double xRatio, double yRatio) {
        this.width *= xRatio;
        this.height *= yRatio;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
