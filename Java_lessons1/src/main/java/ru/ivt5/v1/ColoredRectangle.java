package ru.ivt5.v1;

public class ColoredRectangle {
    private Point topLeft, bottomRight;
    private int color;

    public ColoredRectangle(Point leftTop, Point rightBottom, int color){
        this.topLeft = leftTop;
        this.bottomRight = bottomRight;
        this.color = color;
    }

    public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, int color){
        this(new Point(xLeft, yTop), new Point(xRight, yBottom), color);
    }
    public ColoredRectangle(int length, int width, int color){
        this(0, 0, width, length, color);
    }
    public ColoredRectangle(int color){
        this(0,0, 1, 1,255);
    }
    public ColoredRectangle(){
        this(0,0,1,1,1);
    }
    public Point getTopLeft(){
        return topLeft;
    }
    public Point getBottomRight(){
        return bottomRight;
    }
    public int getColor(){
        return color;
    }
    public void setTopLeft(Point topLeft){
        this.topLeft = topLeft;
    }
    public void setBottomRight(Point bottomRight){
        this.bottomRight = bottomRight;
    }
    public void setColor(int color){
        this.color = color;
    }
    public Point getLength(){
        return bottomRight;
    }
}
