package ru.ivt5.iface.v2;
import ru.ivt5.iface.Colored;
import ru.ivt5.iface.Stretchable;

public class Rectangle extends Figure implements Colored, Stretchable {
    private int width;
    private int height;
    private int color;

    public Rectangle(int x, int y, int width, int height, int color) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
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
