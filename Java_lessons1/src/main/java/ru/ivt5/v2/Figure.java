package ru.ivt5.v2;
import ru.ivt5.iface.HasArea;
import ru.ivt5.iface.Movable;

public abstract class Figure implements Movable, HasArea {
    public int life;
    protected int x;
    protected int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void moveRel(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public abstract boolean isInside(int x, int y);

    public abstract void step();

    public abstract void render();
}

