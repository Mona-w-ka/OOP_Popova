package ru.ivt5.v1;

import ru.ivt5.v3.colors.Color;
import ru.ivt5.v3.colors.ColorException;

public class ColoredCircle {
    private Point center;
    private int radius;
    private Color color;

    public ColoredCircle(Point center, int radius, Color color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    public ColoredCircle(int xCenter, int yCenter, int radius, Color color) {
        this.center = new Point(xCenter, yCenter);
        this.radius = radius;
        this.color = color;
    }

    public ColoredCircle(int radius, Color color) {
        this.center = new Point(0, 0);
        this.radius = radius;
        this.color = color;
    }

    public ColoredCircle(Color color) {
        this.center = new Point(0, 0);
        this.radius = 1;
        this.color = color;
    }

    public ColoredCircle() {
        this.center = new Point(0, 0);
        this.radius = 1;
        this.color = Color.RED;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void moveRel(int dx, int dy) {
        center.moveRel(dx, dy);
    }

    public void resize(double ratio) {
        radius = (int) (radius * ratio);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean isInside(int x, int y) {
        int dx = x - center.getX();
        int dy = y - center.getY();
        return dx * dx + dy * dy <= radius * radius;
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    public ColoredCircle(Point center, int radius, String colorString) throws ColorException, ColorException {
        this(center, radius, Color.colorFromString(colorString));
    }

    public ColoredCircle(int xCenter, int yCenter, int radius, String colorString) throws ColorException {
        this(new Point(xCenter, yCenter), radius, colorString);
    }

    public ColoredCircle(int radius, String colorString) throws ColorException {
        this(new Point(0, 0), radius, colorString);
    }

    public ColoredCircle(String colorString) throws ColorException {
        this(new Point(0, 0), 1, colorString);
    }
}
