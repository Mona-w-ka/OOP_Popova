package ru.ivt5.v1;

import processing.core.PApplet;
import ru.ivt5.v3.Figure;

public class ColoredCircle extends Figure { //extends Circle implements Colored {
    private int color;
    public int life;
    protected float x, y, Diameter, xSpeed, ySpeed;
    protected PApplet sketch;

    public ColoredCircle(PApplet sketch, float x, float y,float dx,float dy) {
        this();
        this.sketch = sketch;
        this.x = x;
        this.y = y;
        this.Diameter = sketch.random(10, 100);
        this.xSpeed = sketch.random(-5, 5)+dx;
        this.ySpeed = sketch.random(-5, 5)+dy;
        this.color = sketch.color(sketch.random(255), sketch.random(255), sketch.random(255));
        life = 500;
    }

    public ColoredCircle() {
        super((int) 0.0f, (int) 0.0f);
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveRel(float dx, float dy) {
        x+= dx;
        y+= dy;
    }

    public void step() {
        moveRel(xSpeed, ySpeed);
        if (x < Diameter/2 ) {
            xSpeed = Math.abs(xSpeed);
            x = Diameter/2;}
        if(x > sketch.width - Diameter/2) {
            xSpeed = -Math.abs(xSpeed);
            x = sketch.width-Diameter/2;}

        if (y < Diameter/2 ) ySpeed = Math.abs(ySpeed);
        if (y > sketch.height - Diameter/2) ySpeed = -Math.abs(ySpeed);
        life -=1;
    }

    public void render() {
        sketch.fill(color);
        sketch.ellipse(x, y, Diameter, Diameter);
    }

    public boolean isInside(int x, int y) {
        return false;
    }

    @Override
    public double getArea() {
        return 0;
    }

}
