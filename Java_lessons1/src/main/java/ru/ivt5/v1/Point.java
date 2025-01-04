package ru.ivt5.v1;

public class Point {

    private int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;

    }

    public Point(){
        this(0, 0);
//        this.x = 0;
//        this.y = 0;

    }

    public void projectToX(){

        this.y = 0;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int i){
        this.x = x;
    }

    public void setY(int i){
        this.y = y;
    }

    public void moveTo(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public void moveRel(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

}

