package ru.ivt5.v1;

public class Ellipse {
    private Point center;
    private int xAxis;
    private int yAxis;

    public Ellipse(Point center, int xAxis, int yAxis) {
        this.center = center;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis) {
        this(new Point(xCenter, yCenter), xAxis, yAxis);
    }

    public Ellipse(int xAxis, int yAxis) {
        this(new Point(0, 0), xAxis, yAxis);
    }

    public Ellipse() {
        this(1, 1);
    }


    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getXAxis() {
        return xAxis;
    }

    public void setXAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public int getYAxis() {
        return yAxis;
    }

    public void setYAxis(int yAxis) {
        this.yAxis = yAxis;
    }


    public void moveTo(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        center.setX(center.getX() + dx);
        center.setY(center.getY() + dy);
    }


    public void resize(double ratio) {
        this.xAxis = (int) (xAxis * ratio);
        this.yAxis = (int) (yAxis * ratio);
    }

    public void stretch(double xRatio, double yRatio) {
        this.xAxis = (int) (xAxis * xRatio);
        this.yAxis = (int) (yAxis * yRatio);
    }


    public double getArea() {
        return Math.PI * xAxis * yAxis / 4.0;
    }

    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(xAxis, 2) + Math.pow(yAxis, 2)) / 8.0);
    }


    public boolean isInside(int x, int y) {
        double relativeX = x - center.getX();
        double relativeY = y - center.getY();
        return (Math.pow(relativeX, 2) / Math.pow(xAxis / 2.0, 2) +
                Math.pow(relativeY, 2) / Math.pow(yAxis / 2.0, 2)) <= 1;
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }
}
