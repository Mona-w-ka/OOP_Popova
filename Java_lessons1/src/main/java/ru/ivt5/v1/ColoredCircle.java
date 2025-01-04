package ru.ivt5.v1;

public class ColoredCircle {
    private Point center;
    private int radius;
    private int color;

    public ColoredCircle(Point center, int radius, int color){
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    public ColoredCircle(int xCenter, int yCenter, int radius, int color) {
        this.center = new Point(xCenter, yCenter);
        this.radius = radius;
        this.color = color;
    }

    public ColoredCircle(int radius, int color) {
        this.center = new Point(0, 0);
        this.radius = radius;
        this.color = color;
    }
    public ColoredCircle(int color) {
        this.center = new Point(0, 0);
        this.radius = 1;
        this.color = color;
    }
    public ColoredCircle(){
        this.center = new Point(0, 0);
        this.radius = 1;
        this.color = 1;
    }
    public Point getCenter(){
        return center;
    }
    public int getRadius(){
        return radius;
    }
    public void setCenter(Point center){
        this.center = center;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getColor(){
        return color;
    }
    public void setColor(int color){
        this.color = color;
    }
    public void moveRel(int dx, int dy){
        center.moveRel(dx, dy);
    }
    public void resize(double ratio){
        radius = (int) (radius * ratio);
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public boolean isInside(int x, int y){
        int dx = x - center.getX();
        int dy = y - center.getY();
        return dx * dx + dy * dy <= radius * radius;
    }
    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }
}
