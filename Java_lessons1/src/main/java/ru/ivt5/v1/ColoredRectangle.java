package ru.ivt5.v1;

import ru.ivt5.v3.colors.Color;
import ru.ivt5.v3.colors.ColorException;

public class ColoredRectangle {
    private Point topLeft, bottomRight;
    private Color color;

    public ColoredRectangle(Point leftTop, Point rightBottom, Color color) {
        this.topLeft = leftTop;
        this.bottomRight = bottomRight;
        this.color = color;
    }

    public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, Color color) {
        this(new Point(xLeft, yTop), new Point(xRight, yBottom), color);
    }

    public ColoredRectangle(int length, int width, Color color) {
        this(0, 0, width, length, color);
    }

    public ColoredRectangle(int color) {
        this(0, 0, 1, 1, Color.RED);
    }

    public ColoredRectangle() {
        this(0, 0, 1, 1, Color.RED);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public Color getColor() {
        return color;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point getLength() {
        return bottomRight;
    }

    public ColoredRectangle(Point leftTop, Point rightBottom, String colorString) throws ColorException, ColorException {
        this(leftTop, rightBottom, Color.colorFromString(colorString));
    }


    public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, String colorString) throws ColorException {
        this(new Point(xLeft, yTop), new Point(xRight, yBottom), colorString);
    }


    public ColoredRectangle(int length, int width, String colorString) throws ColorException {
        this(0, 0, width, length, colorString);

    }
        public void setColor(String colorString) throws ColorException {
            this.color = Color.colorFromString(colorString);
        }
    }

